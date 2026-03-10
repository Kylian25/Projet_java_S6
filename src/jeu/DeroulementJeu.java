package jeu;
import java.util.Scanner;

public class DeroulementJeu {

	public static void main(String[] args) {

		De de1 = new De();
		De de2 = new De();
		Plateau plateau = new Plateau(30);
		Pion pion1 = new Pion(Couleur.ROUGE);
		Pion pion2 = new Pion(Couleur.BLEU);
		Joueur pirate1 = new Joueur("Jack Le Borne", pion1);
		Joueur pirate2 = new Joueur("Bill Jambe de Bois", pion2);
		AffichageJeu affichage = new AffichageJeu();
		Scanner scanner  = new Scanner(System.in);

		affichage.afficherDebutPartie();
		
		plateau.initPlateau();

		while (!estPartieTerminee(pirate1, pirate2)) {
			
			jouerTour(pirate1, affichage, de1, de2,scanner);
			affichage.afficherPosition(pirate1.getNom(), pirate1.getPion().getPosition());
			if (aGagne(pirate1)) {
				affichage.afficherGagnant(pirate1);
			}
			jouerTour(pirate2, affichage, de1, de2,scanner);
			affichage.afficherPosition(pirate2.getNom(), pirate2.getPion().getPosition());
			if (aGagne(pirate2)) {
				affichage.afficherGagnant(pirate2);  // changer les conditions 
			}
			affichage.afficherPositionsJoueurs(pirate1.getNom(), pirate1.getPion().getPosition(), 
											   pirate2.getNom(), pirate2.getPion().getPosition());
		}
		affichage.partieTerminee();
		scanner.close();
	}

	public static boolean estPartieTerminee(Joueur pirate1, Joueur pirate2) {
		return !pirate1.estEnVie() || !pirate2.estEnVie() || pirate1.getPion().getPosition() == 30
				|| pirate2.getPion().getPosition() == 30;
	}

	public static void jouerTour(Joueur pirate, AffichageJeu affichage, De de1, De de2,Scanner scanner) {
		int resDe1;
		int resDe2;
		int distanceDeplacement;
		Pion pion = pirate.getPion();
		affichage.demandeLancerDes(pirate.getNom());
		scanner.nextLine();
		resDe1 = de1.lancerDe();
		resDe2 = de2.lancerDe();
		
		distanceDeplacement = resDe1 + resDe2;
		affichage.afficherResultatsDes(pirate.getNom(), resDe1, resDe2);
		
		if (pion.estDansPlateau(distanceDeplacement+pion.getPosition())) {
			affichage.afficherDeplacement(pirate.getNom(), distanceDeplacement);
			pirate.deplacerPion(distanceDeplacement);
		}
		else {
			affichage.deplacementImpossible();
		}
		
		
		// effet case

	}
	
	public static boolean aGagne(Joueur pirate) {
		return (pirate.getPion().getPosition() == 30);
	}
	

}

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
		IAffichage affichage = new AffichageJeu();
		Scanner scanner = new Scanner(System.in);

		affichage.afficherDebutPartie();

		plateau.initPlateau();

		while (!estPartieTerminee(pirate1, pirate2)) {

			jouerTour(pirate1, plateau, affichage, de1, de2, scanner);
			affichage.afficherPosition(pirate1.getNom(), pirate1.getPion().getPosition());
			affichage.afficherVie(pirate1.getNom(), pirate1.getNbCoeurs());
			affichage.afficherFinTourPirate();
			if (estPartieTerminee(pirate1, pirate2) && (aGagne(pirate1) || !pirate2.estEnVie())) {
				affichage.afficherGagnant(pirate1.getNom());
			} else if (!estPartieTerminee(pirate1, pirate2)) {
				jouerTour(pirate2, plateau, affichage, de1, de2, scanner);
				affichage.afficherPosition(pirate2.getNom(), pirate2.getPion().getPosition());
				affichage.afficherVie(pirate2.getNom(), pirate2.getNbCoeurs());
				affichage.afficherFinTourPirate();
				if (estPartieTerminee(pirate1, pirate2) && (aGagne(pirate2) || !pirate1.estEnVie())) {
					affichage.afficherGagnant(pirate2.getNom());
				}

			}

		}
		affichage.partieTerminee();
		scanner.close();
	}

	public static boolean estPartieTerminee(Joueur pirate1, Joueur pirate2) {
		return !pirate1.estEnVie() || !pirate2.estEnVie() || pirate1.getPion().getPosition() == 30
				|| pirate2.getPion().getPosition() == 30;
	}

	public static void jouerTour(Joueur pirate, Plateau plateau, IAffichage affichage, De de1, De de2,
			Scanner scanner) {
		int resDe1;
		int resDe2;
		int distanceDeplacement;
		int distanceDeDemiTour;
		int positionAvantRetour;
		Pion pion = pirate.getPion();
		affichage.demandeLancerDes(pirate.getNom());
		scanner.nextLine();
		resDe1 = de1.lancerDe();
		resDe2 = de2.lancerDe();

		distanceDeplacement = resDe1 + resDe2;
		affichage.afficherResultatsDes(pirate.getNom(), resDe1, resDe2);

		if (pion.estDansPlateau(distanceDeplacement + pion.getPosition())) {
			affichage.afficherDeplacement(pirate.getNom(), distanceDeplacement);
			pirate.deplacerPion(distanceDeplacement);

			if (plateau.estCaseSpeciale(pion.getPosition())) {
				affichage.arriveSurCaseSpeciale(pion.getPosition());
				plateau.getCaseSpeciale(pion.getPosition()).appliquerEffet(distanceDeplacement, de1, pirate, affichage,
						scanner);
			} else {
				affichage.arriveSurCaseNormale();
			}

		} else {

			distanceDeDemiTour = distanceDeplacement - (30 - pion.getPosition());
			positionAvantRetour = pion.getPosition();
			affichage.deplacementHorsPlateau();
			pion.deplacer(30 - positionAvantRetour);
			affichage.afficherDeplacement(pirate.getNom(), 30 - positionAvantRetour);
			pion.deplacer(-distanceDeDemiTour);
			affichage.afficherDeplacement(pirate.getNom(), -distanceDeDemiTour);

		}

	}

	public static boolean aGagne(Joueur pirate) {
		return (pirate.getPion().getPosition() == 30 && pirate.getNbCoeurs() > 0);
	}

}

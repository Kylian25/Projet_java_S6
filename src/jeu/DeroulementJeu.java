package jeu;

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

		affichage.afficherDebutPartie();
		// demander noms des pirates ?
		plateau.initPlateau();

		while (!estPartieTerminee(pirate1, pirate2)) {
			jouerTour(pirate1, affichage, de1, de2);
			jouerTour(pirate2, affichage, de1, de2);
		}
		// afficher gagnant
	}

	public static boolean estPartieTerminee(Joueur pirate1, Joueur pirate2) {
		return !pirate1.estEnVie() || !pirate2.estEnVie() || pirate1.getPion().getPosition() == 30
				|| pirate2.getPion().getPosition() == 30;
	}

	public static void jouerTour(Joueur pirate, AffichageJeu affichage, De de1, De de2) {
		int resDe1;
		int resDe2;
		int distanceDeplacement;
		affichage.demandeLancerDes(pirate);
		resDe1 = de1.lancerDe();
		resDe2 = de2.lancerDe();
		distanceDeplacement = resDe1 + resDe2;
		affichage.afficherResultatsDes(pirate, resDe1, resDe2);
		affichage.afficherDeplacement(pirate, distanceDeplacement);
		// effet case

	}

	public static void appliquerEffetCase(Joueur pirate, int distanceDeplacement) {
		// TODO
	}

}

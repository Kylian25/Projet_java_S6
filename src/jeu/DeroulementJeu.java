package jeu;

public class DeroulementJeu {

	public static void main(String[] args) {

		De de1 = new De();
		De de2 = new De();
		Plateau plateau;
		Pion pion1 = new Pion(Couleur.ROUGE);
		Pion pion2 = new Pion(Couleur.BLEU);
		Joueur pirate1 = new Joueur("Jack Le Borne", pion1);
		Joueur pirate2 = new Joueur("Bill Jambe de Bois", pion2);
		AffichageJeu affichage = new AffichageJeu();

		// tests

		int res1 = de1.lancerDe();
		int res2 = de2.lancerDe();
		affichage.afficherResultatsDes(pirate1, res1, res2);

	}

}

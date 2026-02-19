package jeu;

public class DeroulementJeu {
	
	De de1 = new De();
	De de2 = new De();
	Plateau plateau;
	Pion pion1 = new Pion(Couleur.ROUGE);
	Pion pion2 = new Pion(Couleur.BLEU);
	Joueur pirate1 = new Joueur("Jack Le Borne", pion1);
	Joueur pirate2 = new Joueur("Bill Jambe de Bois", pion2);
	AffichageJeu affichage = new AffichageJeu();

	public static void main(String[] args) {
		System.out.println("main");
		
	}
	
	public void lancerPartie() {
		System.out.println("");
	}
	
	public boolean estPartieTerminee() {
		return !pirate1.estEnVie() || pirate2.estEnVie() || pion1.getPosition() == 30 || pion2.getPosition() == 30;
	}
}



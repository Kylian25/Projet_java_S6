package jeu;

public class AffichageJeu implements IAffichage {

	@Override
	public void afficherGagnant(Joueur gagnant) {
		System.out.println("Le pirate " + gagnant.getNom() + " a gagné la partie !");

	}

	@Override
	public void afficherResultatsDes(String nomJoueur, int res1, int res2) {
		System.out.println("Le pirate " + nomJoueur + " lance les dés...\n" + "dé 1 : " + res1 + "\ndé 2 : " + res2);
	}
	
	public void afficherPosition(String nomJoueur, int position) {
		System.out.println("Le pirate " + nomJoueur + " est à la case " + position);
	}
	
	public void afficherDeplacement(String nomJoueur, int nb_cases) {
		System.out.println("Le pirate " + nomJoueur + " avance de " + nb_cases + " cases.");
	}
	
	public void demandeLancerDes(String nomJoueur) {
		System.out.println("\n\nC'est au tour de " + nomJoueur + " de lancer les dés. APPUYEZ SUR ENTRER");
	}
	
	public void afficherDebutPartie() {
		System.out.println("Début de la partie !\n");
	}
	
	public void partieTerminee() {
		System.out.println("\nPARTIE TERMINÉE !");
	}
	
	public void afficherPositionsJoueurs(String nomPirate1,int posPirate1, String nomPirate2,int posPirate2) {
		System.out.println("\nLe pirate " + nomPirate1 + " est sur la case " + posPirate1 
				+ "\nLe pirate " + nomPirate2 + " est sur la case " + posPirate2); 
	}
	
	public void deplacementImpossible() {
		System.out.println("Déplacement impossible car le pion serait hors du plateau");
	}

}

package jeu;

public class AffichageJeu implements IAffichage {

	@Override
	public void afficherGagnant(Joueur gagnant) {
		System.out.println("Le pirate " + gagnant.getNom() + " a gagné la partie !");

	}

	@Override
	public void afficherResultatsDes(Joueur joueur, int res1, int res2) {
		System.out.println("Le pirate " + joueur.getNom() + " lance les dés...\n" + "dé 1 : " + res1 + "\ndé 2 : " + res2);
	}
	
	public void afficherPosition(Joueur joueur, int position) {
		System.out.println("Le pirate " + joueur.getNom() + " est à la case " + position);
	}
	
	public void afficherDeplacement(Joueur joueur, int nb_cases) {
		System.out.println("Le pirate " + joueur.getNom() + " avance de " + nb_cases + " cases.");
	}
	
	public void demandeLancerDes(Joueur joueur) {
		System.out.println("\n\nC'est au tour de " + joueur.getNom() + " de lancer les dés. APPUYEZ SUR ENTRER");
	}
	
	public void afficherDebutPartie() {
		System.out.println("Début de la partie !\n");
	}

}

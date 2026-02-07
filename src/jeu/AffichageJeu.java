package jeu;

public class AffichageJeu implements IAffichage {

	@Override
	public void afficherGagnant(Joueur gagnant) {
		System.out.println("Le pirate " + gagnant.getNom() + " a gagné la partie !");

	}

	@Override
	public void afficherResultatsDes(Joueur joueur, int res1, int res2) {
		System.out.println(
				"Le pirate " + joueur.getNom() + " lance les dés...\n\n" + "dé 1 : " + res1 + "\ndé 2 : " + res2);
	}

}

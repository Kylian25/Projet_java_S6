package jeu;

public interface IAffichage {
	void afficherGagnant(Joueur gagnant);
	void afficherDebutPartie();
	void afficherResultatsDes(Joueur joueur, int res1, int res2);
	void afficherPosition(Joueur joueur, int position);
	void afficherDeplacement(Joueur joueur, int nb_cases);
	void demandeLancerDes(Joueur joueur);
}

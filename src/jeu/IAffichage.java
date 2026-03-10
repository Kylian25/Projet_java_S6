package jeu;

public interface IAffichage {
	void afficherGagnant(Joueur gagnant);
	void afficherDebutPartie();
	void afficherResultatsDes(String nomJoueur, int res1, int res2);
	void afficherPosition(String nomJoueur, int position);
	void afficherDeplacement(String nomJoueur, int nb_cases);
	void demandeLancerDes(String nomJoueur);
	void partieTerminee();
	void afficherPositionsJoueurs(String nomPirate1,int posPirate1, String nomPirate2,int posPirate2);
	void deplacementImpossible();
}

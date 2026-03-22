package jeu;

public interface IAffichage {
	void afficherGagnant(String nomGagnant);

	void afficherDebutPartie();

	void afficherResultatsDes(String nomJoueur, int res1, int res2);

	void afficherPosition(String nomJoueur, int position);

	void afficherDeplacement(String nomJoueur, int nbCases);

	void demandeLancerDes(String nomJoueur);

	void partieTerminee();

	void deplacementHorsPlateau();

	void afficherVie(String nomPirate, int nbCoueurs);

	void modificationVie(String nomPirate, int Coeur);

	void modifcationVieImpossible();

	void arriveSurCaseSpeciale(int position);

	void arriveSurCaseNormale();

	void demanderLancerDeCaseSpeciale(String nomPirate);

	void afficherResultatDeCaseSpeciale(String nomPirate, int resultatDe);

	void afficherFinTourPirate();

	void avertissementCaseDemiTour();

	void avertissementCasePlusOuMoins();
}

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

	@Override
	public void afficherPosition(String nomJoueur, int position) {
		System.out.println("\nLe pirate " + nomJoueur + " est à la case " + position);
	}

	@Override
	public void afficherDeplacement(String nomJoueur, int nb_cases) {
		System.out.println("Le pirate " + nomJoueur + " avance de " + nb_cases + " cases.");
	}

	@Override
	public void demandeLancerDes(String nomJoueur) {
		System.out.println("\n\nC'est au tour de " + nomJoueur + " de lancer les dés. APPUYEZ SUR ENTRER");
	}

	@Override
	public void afficherDebutPartie() {
		System.out.println("Début de la partie !\n");
	}

	@Override
	public void partieTerminee() {
		System.out.println("\nPARTIE TERMINÉE !");
	}

	@Override
	public void deplacementImpossible() {
		System.out.println("Déplacement impossible car le pion serait hors du plateau");
	}

	@Override
	public void afficherVie(String nomPirate, int nbCoeurs) {
		System.out.println("Le pirate " + nomPirate + " à " + nbCoeurs + " coeurs");
	}

	@Override
	public void modificationVie(String nomPirate, int Coeur) {

		System.out.println(
				"La vie du pirate " + nomPirate + " à été affecté par cette case. Effet : " + Coeur + " coeur");
	}

	@Override
	public void modifcationVieImpossible() {
		System.out.println("La case n'a aucun effet car votre nombre de coeur est dèja au maximum");
	}

	@Override
	public void arriveSurCaseSpeciale(int position) {
		System.out.println("Vous êtes tombé sur la case " + position
				+ " qui est une case spéciale !!!!\n\n   EFFET CASE SPECIALE\n");
	}

	@Override
	public void arriveSurCaseNormale() {
		System.out.println("Vous êtes tombé sur une case normale !!\n");
	}

	@Override
	public void demanderLancerDeCaseSpeciale(String nomPirate) {
		System.out.println("Le pirate " + nomPirate + " doit lancer un dé.  APPUYEZ SUR ENTRER");
	}

	@Override
	public void afficherResultatDeCaseSpeciale(String nomPirate, int resultatDe) {
		System.out.println("Le pirate " + nomPirate + " lance le dé...\ndé : " + resultatDe);
	}

	@Override
	public void afficherFinTourPirate() {
		System.out.println("\n---------------------------------------------------------------------- \n");
	}

}

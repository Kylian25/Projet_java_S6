package jeu;

public class Plateau {

	private int nbCases;
	private Case[] tabCases;

	public Plateau(int nbCases) {
		this.nbCases = nbCases;
		this.tabCases = new Case[nbCases];
	}

	public void initPlateau() {

		for (int i = 0; i < nbCases; i++) {
			if (i % 5 == 1) {
				tabCases[i] = new CaseRetour(i);
			} else if (i % 4 == 1) {
				tabCases[i] = new CaseVie(i);
			} else {
				tabCases[i] = new CaseNormale(i);
			}
		}
	}

}

package jeu;

public class Plateau {

	private int nbCasesSpeciales;
	private CaseSpeciale[] tabCasesSpeciales;

	public Plateau(int nbCasesSpeciales) {
		this.nbCasesSpeciales = nbCasesSpeciales;
		this.tabCasesSpeciales = new CaseSpeciale[nbCasesSpeciales];
	}

	public boolean estCaseSpeciale(int numeroCase) {

		for (int k = 0; k < nbCasesSpeciales; k++) {
			if (tabCasesSpeciales[k].getNumeroCase() == numeroCase) {
				return true;
			}
		}
		return false;
	}

	public CaseSpeciale getCaseSpeciale(int numeroCase) {
		for (int k = 0; k < nbCasesSpeciales; k++) {
			if (tabCasesSpeciales[k].getNumeroCase() == numeroCase) {
				return tabCasesSpeciales[k];
			}
		}
		return null;
	}

	public void initPlateau() {
		int nbCasesPlateau = 30;

		for (int k = 0; k < nbCasesSpeciales; k++) {

			int numeroCase = 1 + k * (nbCasesPlateau / nbCasesSpeciales);

			if (k % 2 == 0) {
				tabCasesSpeciales[k] = new CaseDemiTour(numeroCase);
			} else {
				tabCasesSpeciales[k] = new CasePlusOuMoins(numeroCase);
			}
		}
	}

}

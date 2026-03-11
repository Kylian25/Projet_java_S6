package jeu;

import java.util.Scanner;

public class CaseDemiTour extends CaseSpeciale {

	public CaseDemiTour(int numeroCase) {
		super(numeroCase);
	}

	@Override
	public void appliquerEffet(int distanceDeDeplacement, De de, Joueur pirate, AffichageJeu affichage,
			Scanner scanner) {

		pirate.deplacerPion(-distanceDeDeplacement);
		affichage.afficherDeplacement(pirate.getNom(), -distanceDeDeplacement);

	}

}

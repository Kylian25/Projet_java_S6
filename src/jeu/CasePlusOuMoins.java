package jeu;

import java.util.Scanner;

public class CasePlusOuMoins extends CaseSpeciale {

	public CasePlusOuMoins(int numeroCase) {
		super(numeroCase);
	}

	@Override
	public void appliquerEffet(int distanceDeDeplacement, De de, Joueur pirate, AffichageJeu affichage,
			Scanner scanner) {

		int resultatDe;

		affichage.demanderLancerDeCaseSpeciale(pirate.getNom());
		scanner.nextLine();
		resultatDe = de.lancerDe();
		affichage.afficherResultatDeCaseSpeciale(pirate.getNom(), resultatDe);

		if (resultatDe <= 3 && pirate.getNbCoeurs() >= 1) {
			pirate.enleverVie(1);
			affichage.modificationVie(pirate.getNom(), -1);
		} else if (resultatDe > 3 && pirate.getNbCoeurs() < 5) {
			pirate.ajouterVie(1);
			affichage.modificationVie(pirate.getNom(), +1);
		} else {
			affichage.modifcationVieImpossible();
		}

	}

}

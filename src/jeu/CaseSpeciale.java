package jeu;

import java.util.Scanner;

public abstract class CaseSpeciale {

	protected int numeroCase;

	protected CaseSpeciale(int positionPlateau) {
		numeroCase = positionPlateau;
	}

	public void appliquerEffet(int distanceDeDeplacement, De de, Joueur pirate, IAffichage affichage, Scanner scanner) {

	}

	public int getNumeroCase() {
		return numeroCase;
	}
}

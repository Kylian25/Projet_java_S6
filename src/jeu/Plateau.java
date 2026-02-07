package jeu;

public class Plateau {

	private int[] tab_cases = new int[30];

	public void initPlateau() {
		for (int i = 0; i < 30; i++) {
			tab_cases[i] = i + 1;
		}
	}
}

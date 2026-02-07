package jeu;

public class Pion {

	private Couleur couleur;
	private int position = 0;

	public Pion(Couleur couleurPion) {
		couleur = couleurPion;
	}

	public int getPosition() {
		return position;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void deplacer(int nb_cases) {
		position = position + nb_cases;
	}

}

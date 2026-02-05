package jeu;

public class Pion extends Joueur {
	
	private String couleur;
	private String nomPion;
	private int position;
	
	public Pion(String nomJoueur) {
		super(nomJoueur);
	}
	
	public void changerPosition(int nb_cases) {
		position = position + nb_cases;
	}
	
}

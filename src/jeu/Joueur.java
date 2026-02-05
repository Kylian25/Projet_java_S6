package jeu;
import java.security.SecureRandom;
import java.util.Random;

public class Joueur {
	private String nom;
	private int nbCoeurs = 5;
	private Random random;
	
	public Joueur(String nomJoueur) {
		nom = nomJoueur;
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
			random = new Random();
		}
	}
	
	public int seDeplacer(int nb_cases) {
		return 0;
	}
	
	public boolean aGagne(int numCase) {
		return true;
	}
	
	public int lancerDe() {
		return random.nextInt(2, 13);
	}
}

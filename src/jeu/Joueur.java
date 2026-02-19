package jeu;

public class Joueur {
	private String nom;
	private int nb_coeurs = 5;
	private Pion pion;

	public Joueur(String nomJoueur, Pion pionJoueur) {
		nom = nomJoueur;
		pion = pionJoueur;
	}

	public String getNom() {
		return nom;
	}

	public void deplacerPion(int nb_cases) {
		pion.deplacer(nb_cases);
	}

	public boolean estEnVie() {
		return (nb_coeurs > 0);
	}

	public void enleverVie(int degats) {
		if (nb_coeurs - degats > 0) {
			nb_coeurs -= degats;
		} else {
			nb_coeurs = 0;
		}
	}

	public void ajouterVie(int coeurs) {
		if (nb_coeurs + coeurs <= 5) {
			nb_coeurs += coeurs;
		}
	}

	public int getNbCoeurs() {
		return nb_coeurs;
	}

	public Pion getPion() {
		return this.pion;
	}
}

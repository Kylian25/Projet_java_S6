package jeu;

public class Joueur {
	private String nom;
	private int nbCoeurs = 5;
	private Pion pion;

	public Joueur(String nomJoueur, Pion pionJoueur) {
		nom = nomJoueur;
		pion = pionJoueur;
	}

	public String getNom() {
		return nom;
	}

	public void deplacerPion(int nbCases) {
		pion.deplacer(nbCases);
	}

	public boolean estEnVie() {
		return (nbCoeurs > 0);
	}

	public void enleverVie(int degats) {
		if (nbCoeurs - degats > 0) {
			nbCoeurs -= degats;
		} else {
			nbCoeurs = 0;
		}
	}

	public void ajouterVie(int coeurs) {
		if (nbCoeurs + coeurs <= 5) {
			nbCoeurs += coeurs;
		}
	}

	public int getNbCoeurs() {
		return nbCoeurs;
	}

	public Pion getPion() {
		return this.pion;
	}
}

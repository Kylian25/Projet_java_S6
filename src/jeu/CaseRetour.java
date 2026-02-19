package jeu;

public class CaseRetour extends Case {

	public CaseRetour(int position) {
		super(position);
	}

	public void effetCaseRetour(int distance, Joueur pirate) {
		pirate.deplacerPion(-distance);
	}
}

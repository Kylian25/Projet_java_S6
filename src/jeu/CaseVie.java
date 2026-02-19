package jeu;

public class CaseVie extends Case {

	public CaseVie(int position) {
		super(position);
	}

	public void effetCaseVie(int resultatDe, Joueur pirate) {

		if (resultatDe < 3 && pirate.getNbCoeurs() > 1) {
			pirate.enleverVie(1);
		} else if (resultatDe >= 3 && pirate.getNbCoeurs() < 5) {
			pirate.ajouterVie(1);
		}
	}
}

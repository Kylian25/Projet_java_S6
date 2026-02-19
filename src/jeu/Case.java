package jeu;

public abstract class Case {
	
	protected int position;
	
	public Case(int position) {
		this.position = position;
	}
	
	public int getPosition() {
		return this.position;
	}
}

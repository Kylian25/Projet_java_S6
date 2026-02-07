package jeu;

import java.security.SecureRandom;
import java.util.Random;

public class De {

	private Random random;

	public De() {
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
			random = new Random();
		}
	}

	public int lancerDe() {
		return random.nextInt(1, 7);
	}
}

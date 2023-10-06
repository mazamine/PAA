package up.mi.am.td02;

import up.mi.jgm.maths.*;

public class Utilitaire {
	public static Rationnel puissance(Rationnel r, int n) {
		Rationnel a = new Rationnel(1, 1);
		for (int i = 0; i < n; i++) {
			a = a.multiplication(r);
		}
		return a;
	}

	public static Complexe somme(Complexe c1, Complexe c2) {
		Complexe c = new Complexe(c1.getPartieReelle() + c2.getPartieReelle(),
				c1.getPartieImaginaire() + c2.getPartieImaginaire());
		return c;
	}

	public static Complexe multipilication(Complexe c1, Complexe c2) {
		Complexe c = new Complexe(
				(c1.getPartieReelle() * c2.getPartieReelle()) - (c1.getPartieImaginaire() * c2.getPartieImaginaire()),
				(c1.getPartieReelle() * c2.getPartieImaginaire()) + (c1.getPartieImaginaire() * c2.getPartieReelle()));
		return c;
	}
}
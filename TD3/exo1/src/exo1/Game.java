package exo1;

import java.util.Scanner;

public class Game {
	private static Scanner scan;
	
	public static Personnage choixPersonnageHumain() {
		scan = new Scanner(System.in);
		int choix;
		System.out.println("Choisissez votre personnage :\n1-Aragon\n2-Gimili\n3-legolas");
		choix = scan.nextInt();
		switch (choix) {
		case 1:
			return Personnage.Aragon;
		case 2:
			return Personnage.Gimili;
		case 3:
			return Personnage.Legolas;
		default:
			System.out.println("choix invalide");
		}
		return choixPersonnageHumain();
	}
	
	public static Personnage choixPersonnageOrdinateur(Personnage p) {
		Personnage[] listePersonnages = { Personnage.Aragon, Personnage.Gimili, Personnage.Legolas };
		Personnage q = listePersonnages[(int)(Math.random()*listePersonnages.length)];
		if(q.equals(p)) {
			return choixPersonnageOrdinateur(p);
		} else {
		return q;
		}
	}

	public static void main(String[] args) {
		Personnage humain, ordinateur;
		humain = choixPersonnageHumain();
		System.out.println("humain : "+humain.getName());
		ordinateur = choixPersonnageOrdinateur(humain);
		System.out.println("ordinateur : "+ordinateur.getName());
	}
}

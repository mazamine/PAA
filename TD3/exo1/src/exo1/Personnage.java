package exo1;

import java.util.Scanner;

public class Personnage {
	int nombreDeVies;
	Arme arme1, arme2;
	String name;

	public Personnage(int nombreDeVies, Arme arme1, Arme arme2, String name) {
		this.nombreDeVies = nombreDeVies;
		this.arme1 = arme1;
		this.arme2 = arme2;
		this.name = name;
	}

	public static Personnage Aragon = new Personnage(100, Arme.epe(8, 10), Arme.arc(10, 5), "Aragon");
	public static Personnage Gimili = new Personnage(80, Arme.epe(8, 8), Arme.hache(12, 9), "Gimili");
	public static Personnage Legolas = new Personnage(80, Arme.epe(6, 8), Arme.arc(15, 7), "Legolas");
	private Scanner scan;

	public void attaque(Personnage p) {
		scan = new Scanner(System.in);
		System.out.println("Veuillez choisir une attaque");
		System.out.println("1-" + this.arme1.getName() + " : " + this.arme1.getNb() + "\n");
		System.out.println("2-" + this.arme2.getName() + " : " + this.arme2.getNb() + "\n");
		int choix = scan.nextInt();
		switch (choix) {
		case 1:
			if (this.arme1.getNb() > 0) {
				this.arme1.nb--;
				p.nombreDeVies -= this.arme1.getForce();
			} else {
				System.out.println("nombre d'attaques insuffisant");
				attaque(p);
			}
			break;
		case 2:
			if (this.arme2.getNb() > 0) {
				this.arme2.nb--;
				p.nombreDeVies -= this.arme2.getForce();
			} else {
				System.out.println("nombre d'attaques insuffisant");
				attaque(p);
			}
			break;
		default:
			System.out.println("choix invalide");
			attaque(p);
			break;
		}
	}
	public String getName() {
		return name;
	}
}

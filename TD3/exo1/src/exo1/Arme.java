package exo1;

public class Arme {
	String name;
	int nb;
	int force;
	public Arme(int nb, int force) {
		this.nb = nb;
		this.force = force;
	}
	public Arme(int nb, int force, String name) {
		this.nb = nb;
		this.force = force;
		this.name = name;
	}
	public static Arme epe(int a, int b) {
		return new Arme(a, b, "Epe"); 
	}
	public static Arme arc(int a, int b) {
		return new Arme(a, b, "Arc"); 
	}
	public static Arme hache(int a, int b) {
		return new Arme(a, b, "Hache"); 
	}
	
	public int getForce() {return force;}
	public int getNb() {return nb;}
	public String getName() {return name;}
}

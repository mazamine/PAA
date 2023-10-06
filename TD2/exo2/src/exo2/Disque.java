package exo2;

public class Disque {
	Point centre;
	double rayon;

	public Disque(Point centre, double rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}

	public Point getCentre() {
		return centre;
	}

	public double getRayon() {
		return rayon;
	}

	public boolean inDisque(Point p) {

		if (p.distCarre(centre) <= (rayon * rayon)) {
			return true;
		}
		return false;
	}

	public boolean intersection(Disque d) {
		if (this.getCentre().distCarre(d.getCentre()) <= (this.getRayon() + d.getRayon())
				* (this.getRayon() + d.getRayon())) {
			return true;
		}
		return false;
	}

	public Disque deplace(Vecteur v) {
		return new Disque(this.getCentre().deplace(v), this.getRayon());
	}
}

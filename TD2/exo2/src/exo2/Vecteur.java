package exo2;

public class Vecteur {
	Point a, b;

	public Vecteur(Point a, Point b) {
		this.a = a;
		this.b = b;
	}

	public Point getA() {
		return a;
	}

	public Point getB() {
		return b;
	}

	public boolean equals(Vecteur v) {
		if (this.getA().getX() - this.getB().getX() == v.getA().getX() - v.getB().getX()) {
			if (this.getA().getY() - this.getB().getY() == v.getA().getY() - v.getB().getY()) {
				return true;
			}
		}
		return false;
	}
}

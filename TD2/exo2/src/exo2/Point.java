package exo2;

public class Point {
	double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distCarre(Point a) {

		return ((a.getX() - this.getX()) * (a.getX() - this.getX())
				+ (a.getY() - this.getY()) * (a.getY() - this.getY()));

	}

	public Point deplace(Vecteur v) {
		return new Point(this.getX() + (v.getB().getX() - v.getA().getX()),
				this.getY() + (v.getB().getY() - v.getA().getY()));
	}

}

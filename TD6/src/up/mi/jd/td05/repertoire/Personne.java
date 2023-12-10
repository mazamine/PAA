package up.mi.jd.td05.repertoire;

public class Personne implements Comparable<Personne>{
	
	private String prenom;
	
	private String nom;
	
	private String numTel;
	
	public Personne(String p, String n, String num) {
		this.prenom = p;
		this.setNom(n);
		this.setNumTel(num);
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	
	@Override
	public String toString() {
		return "(" + this.prenom + "," + this.nom + "," + this.numTel + ")";
	}
	
	@Override
	public int compareTo(Personne p) {
		return this.nom.compareTo(p.nom);
	}

}

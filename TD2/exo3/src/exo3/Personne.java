package exo3;

import java.util.List;
import java.util.ArrayList;

public class Personne {
	private String nom;
	private String prenom;
	private List<String> numerosTelephone;

	public Personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
		numerosTelephone = new ArrayList<String>();
	}

	public void addNumero(String numero) {
		numerosTelephone.add(numero);
	}

	public String toString1() {
		String resultat = prenom + " " + nom + " \n";
		for (int i = 0; i < numerosTelephone.size(); i++) {
			resultat += "numero " + (i + 1) + " : ";
			resultat += numerosTelephone.get(i) + " \n";
		}
		return resultat;
	}
	
	public String toString2() {
		StringBuilder resultat = new StringBuilder();
		resultat.append(prenom + " " + nom + " \n");
		for (int i = 0; i < numerosTelephone.size(); i++) {
			resultat.append("numero " + (i + 1) + " : ");
			resultat.append(numerosTelephone.get(i) + " \n");
		}
		return resultat.toString();
	}
	
	public static void main(String[] args) {
		Personne p = new Personne("John", "Lennon");
		p.addNumero("0123456789");
		p.addNumero("0132456789");
		p.addNumero("0123996789");
		p.addNumero("0123459876");
		System.out.println(p.toString1());
		System.out.println(p.toString2());
	}
}







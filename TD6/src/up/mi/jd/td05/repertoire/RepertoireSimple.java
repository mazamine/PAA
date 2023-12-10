package up.mi.jd.td05.repertoire;

import java.util.ArrayList;
import java.util.Collections;

public class RepertoireSimple {

	private ArrayList<Personne> repertoire;
	
	public RepertoireSimple() {
		this.repertoire = new ArrayList<Personne>();
	}
	
	public void addPersonne(String prenom, String nom, String numTel) {
		this.repertoire.add(new Personne(prenom,nom,numTel));
	}
	
	public String chercheNumero(String prenom, String nom) {
		for(Personne p : repertoire) {
			if(p.getNom().equals(nom) && p.getPrenom().equals(prenom))
				return p.getNumTel();
		}
		return "L'identité " + nom + " " + prenom + " est inconnue.";
	}
	
	public String cherchePersonne(String numTel) {
		for(Personne p : this.getRepertoire()) {
			if(p.getNumTel().equals(numTel))
				return p.getPrenom() + " " + p.getNom();
		}
		return  "le numéro " + numTel + " n'appartient à personne" ;
	}
	
	public ArrayList<Personne> getRepertoire(){
		return this.repertoire;
	}
	
	public void tri() {
		Collections.sort(this.repertoire);
	}
}

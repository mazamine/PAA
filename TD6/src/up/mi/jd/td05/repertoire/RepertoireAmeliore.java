package up.mi.jd.td05.repertoire;

public class RepertoireAmeliore extends RepertoireSimple {

	private Personne proprio;
	
	public RepertoireAmeliore(Personne prop) {
		super();
		this.proprio = prop;
	}
	
	public String toString() {
		StringBuilder build = new StringBuilder("proprietaire");
		build.append(this.proprio.toString());
		build.append("\n");
		for(Personne p : this.getRepertoire()) {
			build.append("contact");
			build.append(p.toString());
			build.append("\n");
		}
		return build.toString();
	}
	
	public Personne getProprietaire() {
		return proprio;
	}
	
	public void setProprietaire(Personne proprietaire) {
		this.proprio = proprietaire;
	}
	
	
}

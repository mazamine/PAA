package up.mi.jd.td05.repertoire;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserRepertoire {

	/**
	 * Cree un RepertoireAmeliore a partir d'un fichier texte
	 * 
	 * @param file le chemin vers le fichier
	 * @return le RepertoireAmeliore qui est decrit par file
	 */
	public static RepertoireAmeliore parser(String file) throws RepertoireException {
		try (BufferedReader bufR = new BufferedReader(new FileReader(file))) {
			String line = null;

			Personne proprietaire = null;
			List<Personne> contacts = new ArrayList<Personne>();

			while ((line = bufR.readLine()) != null) {
				if (line.startsWith("proprietaire")) {
					proprietaire = parserPersonne(line);
				} else if (line.startsWith("contact")) {
					contacts.add(parserPersonne(line));
				} else {
					//System.err.println("La ligne est incorrecte : " + line);
					//System.exit(1);
					throw new RepertoireException("La ligne est incorrecte : " + line);
				}
			}

			RepertoireAmeliore rep = new RepertoireAmeliore(proprietaire);
			for (Personne per : contacts) {
				rep.addPersonne(per.getPrenom(), per.getNom(), per.getNumTel());
			}
			return rep;

		} catch (FileNotFoundException e) {
			//System.err.println(e.getMessage());
			//System.exit(1);
			throw new RepertoireException(e.getMessage());
		} catch (IOException e) {
			//System.err.println(e.getMessage());
			//System.exit(1);
			throw new RepertoireException(e.getMessage());
		}
		//return null;
	}

	/**
	 * Cree une personne a partir d'une ligne
	 * 
	 * @param line la ligne qui decrit la personne
	 * @return l'objet Personne qui correspond a line
	 */
	private static Personne parserPersonne(String line) {
		String[] donnees = line.split("\\(")[1].split("\\)")[0].split(",");
		return new Personne(donnees[0], donnees[1], donnees[2]);
	}
}

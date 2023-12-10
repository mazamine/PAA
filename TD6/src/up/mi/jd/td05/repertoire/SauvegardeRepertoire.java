package up.mi.jd.td05.repertoire;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class SauvegardeRepertoire {
	
	/**
	 * Permet de sauvegarder un RepertoireAmeliore dans un fichier texte
	 * @param rep le RepertoireAmeliore qui doit etre sauvegarde
	 * @param file le chemin du fichier
	 */
	public static void sauvegarder(RepertoireAmeliore rep, String file) {
		try (PrintWriter printW = new PrintWriter(new BufferedWriter(new FileWriter(file)))) {
			Personne proprio = rep.getProprietaire();
			printW.println(
					"proprietaire(" + proprio.getPrenom() + "," + proprio.getNom() + "," + proprio.getNumTel() + ")");
			for (Personne contact : rep.getRepertoire()) {
				printW.println(
						"contact(" + contact.getPrenom() + "," + contact.getNom() + "," + contact.getNumTel() + ")");
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
	}
}

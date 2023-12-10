package up.mi.jgm.td06.tictactoe;

public interface IJeu {
	/**
	 * Indique si le jeu est fini
	 * 
	 * @return true si et seulement si le jeu est fini
	 */
	public boolean estFini();

	/**
	 * Determine quel est le prochain joueur
	 * 
	 * @return le symbole correspondant au prochain joueur
	 */
	public char prochainJoueur();

	/**
	 * Effectue le tour d'un joueur
	 * 
	 * @param x le symbole correspondant au joueur dont c'est le tour
	 */
	public void tourJoueur(char x);

	/**
	 * Indique si un joueur a gagne le jeu
	 * 
	 * @param x le joueur qui doit etre teste
	 * @return true si et seulement si le joueur x a gagne
	 */
	public boolean aGagne(char x);

	/**
	 * Permet de feliciter le joueur gagnant
	 * 
	 * @param x le gagnant de la partie
	 */
	public void feliciter(char x);

	/**
	 * Informe les joueurs qu'ils ont tous les deux perdu
	 */
	public void perdu();
}
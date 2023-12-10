package up.mi.jgm.td06.tictactoe;

public interface ITicTacToe {
	/**
	 * Symbole correspondant au premier joueur
	 */
	public static final char X = 'X';

	/**
	 * Symbole correspondant au second joueur
	 */
	public static final char O = 'O';

	/**
	 * Symbole correspondant a une case vide
	 */
	public static final char VIDE = ' ';

	/**
	 * Permet d'obtenir le symbole place a une certaine position dans la grille
	 * 
	 * @param x l'abscisse de la position demandee
	 * @param y l'ordonnee de la position demandee
	 * @return le symbole contenu a la position (x,y)
	 */
	public char getSymbole(int x, int y);

	/**
	 * Place un symbole a une position donnee
	 * 
	 * @param symbole le symbole a placer
	 * @param x       l'abscisse de la position
	 * @param y       l'ordonnee de la position
	 */
	public void putSymbole(char symbole, int x, int y);

	/**
	 * Determine si un joueur a gagne
	 * 
	 * @param symbole le symbole correspondant a un joueur
	 * @return true si et seulement si la joueur correspondant au symbole a gagne
	 */
	public boolean aGagne(char symbole);

	/**
	 * Determine si la grille de jeu est pleine
	 * 
	 * @return true si et seulement si la grille est pleine
	 */
	public boolean grillePleine();
}
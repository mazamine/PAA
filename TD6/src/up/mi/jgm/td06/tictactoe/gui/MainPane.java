package up.mi.jgm.td06.tictactoe.gui;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import up.mi.jgm.td06.tictactoe.IJeu;
import up.mi.jgm.td06.tictactoe.ITicTacToe;

public class MainPane extends BorderPane implements IJeu {

	private Label label;
	private Grille grille;
	private ITicTacToe tictactoe;
	private char prochainJoueur;

	public MainPane(ITicTacToe tictactoe) {
		prochainJoueur = ITicTacToe.X;
		label = new Label("Tour du joueur " + prochainJoueur());
		grille = new Grille(this);
		this.tictactoe = tictactoe;
		this.setTop(label);
		this.setCenter(grille);
	}

	@Override
	public boolean estFini() {
		return tictactoe.aGagne(ITicTacToe.X) || tictactoe.aGagne(ITicTacToe.O) || tictactoe.grillePleine();
	}

	@Override
	public char prochainJoueur() {
		return prochainJoueur;
	}

	@Override
	public void tourJoueur(char x) {
		if (!estFini()) {
			joueurSuivant();
			label.setText("Tour du joueur " + prochainJoueur());
		} else {
			if (aGagne(ITicTacToe.X)) {
				feliciter(ITicTacToe.X);
			} else if (aGagne(ITicTacToe.O)) {
				feliciter(ITicTacToe.O);
			} else {
				perdu();
			}
			grille.setDisable(true);
		}
	}

	@Override
	public boolean aGagne(char x) {
		return tictactoe.aGagne(x);
	}

	@Override
	public void feliciter(char x) {
		label.setText("Félicitations Joueur " + x + " ! Vous avez gagné !");

	}

	@Override
	public void perdu() {
		label.setText("Perdu ! La grille est pleine !");
	}

	/**
	 * Met a jouer le joueur a la fin d'un tour
	 */
	private void joueurSuivant() {
		prochainJoueur = (prochainJoueur == ITicTacToe.X) ? ITicTacToe.O : ITicTacToe.X;
	}
	
	/**
	 * Met le symbole d'un joueur dans la grille a des coordonnees
	 * @param symbole le symbole a mettre dans la grille
	 * @param x la ligne
	 * @param y la colonne
	 */
	public void putSymbole(char symbole, int x, int y) {
		tictactoe.putSymbole(symbole, x, y);
	}

}

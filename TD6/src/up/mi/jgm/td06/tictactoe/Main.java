package up.mi.jgm.td06.tictactoe;

public class Main {
	public static void main(String[] args) {
		IJeu jeu = new Jeu(new TicTacToe());

		while (!jeu.estFini()) {
			char x = jeu.prochainJoueur();
			jeu.tourJoueur(x);
		}

		if (jeu.aGagne(ITicTacToe.O)) {
			jeu.feliciter(ITicTacToe.O);
		} else if (jeu.aGagne(ITicTacToe.X)) {
			jeu.feliciter(ITicTacToe.X);
		} else {
			jeu.perdu();
		}
	}
}
package up.mi.jgm.td06.tictactoe;

public class TicTacToe implements ITicTacToe {
	char[][] grille;

	public TicTacToe() {
		grille = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				grille[i][j] = ITicTacToe.VIDE;
			}
		}
	}

	@Override
	public char getSymbole(int x, int y) {
		return grille[x][y];
	}

	@Override
	public void putSymbole(char symbole, int x, int y) {
		if (grille[x][y] == ITicTacToe.VIDE)
			grille[x][y] = symbole;
	}

	@Override
	public boolean aGagne(char symbole) {
		for (int ligne = 0; ligne < 3; ligne++) {
			if (aGagneLigne(symbole, ligne))
				return true;
		}
		for (int colonne = 0; colonne < 3; colonne++) {
			if (aGagneColonne(symbole, colonne))
				return true;
		}
		if (aGagneDiagonale1(symbole) || aGagneDiagonale2(symbole))
			return true;

		return false;
	}

	private boolean aGagneColonne(char symbole, int colonne) {
		return (grille[0][colonne] == symbole) && (grille[1][colonne] == symbole) && (grille[2][colonne] == symbole);
	}

	private boolean aGagneLigne(char symbole, int ligne) {
		return (grille[ligne][0] == symbole) && (grille[ligne][1] == symbole) && (grille[ligne][2] == symbole);
	}

	private boolean aGagneDiagonale1(char symbole) {
		return (grille[0][0] == symbole) && (grille[1][1] == symbole) && (grille[2][2] == symbole);
	}

	private boolean aGagneDiagonale2(char symbole) {
		return (grille[0][2] == symbole) && (grille[1][1] == symbole) && (grille[2][0] == symbole);
	}

	@Override
	public boolean grillePleine() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (grille[i][j] == ITicTacToe.VIDE) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return ligneToString(0) + ligneToString(1) + ligneToString(2);
	}

	private String ligneToString(int ligne) {
		return grille[ligne][0] + "|" + grille[ligne][1] + "|" + grille[ligne][2] + "\n";
	}
}
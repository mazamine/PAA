package up.mi.jgm.td06.tictactoe;

import java.util.Scanner;

public class Jeu implements IJeu {
	private ITicTacToe ticTacToe;
	private char prochainJoueur;
	private Scanner sc;

	public Jeu(ITicTacToe ticTacToe) {
		this.ticTacToe = ticTacToe;
		prochainJoueur = ITicTacToe.X;
		sc = new Scanner(System.in);
	}

	@Override
	public boolean estFini() {
		boolean estFini = (ticTacToe.aGagne(ITicTacToe.O)) || (ticTacToe.aGagne(ITicTacToe.X))
				|| (ticTacToe.grillePleine());
		if (estFini)
			sc.close();
		return estFini;
	}

	@Override
	public char prochainJoueur() {
		return prochainJoueur;
	}

	@Override
	public void tourJoueur(char x) {
		System.out.println("Joueur " + x + ", quelle case voulez vous jouer ?");
		System.out.println("Abscisse : ");
		int abs = sc.nextInt();
		System.out.println("Ordonnee : ");
		int ord = sc.nextInt();
		ticTacToe.putSymbole(x, abs, ord);
		System.out.println(ticTacToe);

		if (prochainJoueur == ITicTacToe.X) {
			prochainJoueur = ITicTacToe.O;
		} else {
			prochainJoueur = ITicTacToe.X;
		}
	}

	@Override
	public boolean aGagne(char x) {
		return ticTacToe.aGagne(x);
	}

	@Override
	public void feliciter(char x) {
		System.out.println("Felicitations " + "au joueur " + x + " !");
	}

	@Override
	public void perdu() {
		System.out.println("Le jeu est bloque !" + " Tout le monde a perdu !");
	}

}

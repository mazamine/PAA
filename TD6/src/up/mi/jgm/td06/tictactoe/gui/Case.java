package up.mi.jgm.td06.tictactoe.gui;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import up.mi.jgm.td06.tictactoe.ITicTacToe;

public class Case extends Button {
	private final String imgRep = "file:/chemin/vers/les/images/";
	private final String imgVide = imgRep + "vide.png";
	private final String imgCroix = imgRep + "croix.png";
	private final String imgRond = imgRep + "rond.png";
	private int ligne;
	private int colonne;

	public Case(MainPane pane, int ligne, int colonne) {
		super("");
		this.setGraphic(new ImageView(new Image(imgVide)));
		this.ligne = ligne;
		this.colonne = colonne;

		setOnAction((event) -> {
			char joueur = pane.prochainJoueur();

			if (joueur == ITicTacToe.X)
				setGraphic(new ImageView(new Image(imgCroix)));
			else
				setGraphic(new ImageView(new Image(imgRond)));
			pane.putSymbole(joueur, this.ligne, this.colonne);
			setDisable(true);

			pane.tourJoueur(joueur);
		});
	}
}

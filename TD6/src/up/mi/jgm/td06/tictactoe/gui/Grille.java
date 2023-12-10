package up.mi.jgm.td06.tictactoe.gui;

import javafx.scene.layout.GridPane;

public class Grille extends GridPane {

	private Case[] cases;

	public Grille(MainPane pane) {
		cases = new Case[9];
		for (int i = 0; i < 9; i++) {
			cases[i] = new Case(pane, i / 3, i % 3);
			GridPane.setRowIndex(cases[i], i / 3);
			GridPane.setColumnIndex(cases[i], i % 3);
			this.getChildren().add(cases[i]);
		}
	}

}

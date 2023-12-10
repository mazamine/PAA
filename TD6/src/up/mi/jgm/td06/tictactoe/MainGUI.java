package up.mi.jgm.td06.tictactoe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import up.mi.jgm.td06.tictactoe.gui.MainPane;

public class MainGUI extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Tic Tac Toe");
		Scene scene = new Scene(new MainPane(new TicTacToe()));
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();
	}

	public static void main(String[] args) {
		System.err.println(
				"Dans la classe Case, modifiez la valeur de la variable imgRep pour indiquer le chemin vers le répertoire qui contient les images, puis supprimez cette ligne et la suivante dans la méthode main pour que le programme s'exécute.");
		System.exit(1);
		launch(args);
	}
}

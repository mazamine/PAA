package up.mi.jgm.td06.repertoire;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import up.mi.jd.td05.repertoire.RepertoireAmeliore;


public class RepertoireGUI extends Application {
	public static RepertoireAmeliore repertoire = null;
	public static MenuScene menuScene = null ;

	@Override
	public void start(Stage stage) throws Exception {
		menuScene = new MenuScene(stage);
		Pane main = new StartPane(stage);
		Scene scene = new Scene(main);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.setTitle("Gestion de repertoires");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}

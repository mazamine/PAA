package up.mi.jgm.td06.repertoire;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuScene extends Scene {

	public MenuScene(Stage stage) {
		super(new MenuPane(stage));
	}

}

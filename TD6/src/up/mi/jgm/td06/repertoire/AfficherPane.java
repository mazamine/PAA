package up.mi.jgm.td06.repertoire;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AfficherPane extends BorderPane {

	public AfficherPane(Stage stage) {
		TextArea area = new TextArea();
		area.setEditable(false);
		area.setText(RepertoireGUI.repertoire.toString());
		Button button = new Button("Menu");
		this.setCenter(area);
		this.setBottom(button);
		button.setOnAction((event)->{
			stage.setScene(RepertoireGUI.menuScene);
		});
	}

}

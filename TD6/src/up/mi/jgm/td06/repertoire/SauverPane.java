package up.mi.jgm.td06.repertoire;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import up.mi.jd.td05.repertoire.SauvegardeRepertoire;

public class SauverPane extends BorderPane {

	public SauverPane(Stage stage) {
		Label lab = new Label("Chemin du fichier : ");
		TextField tf = new TextField();
		Button button = new Button("Sauver");
		this.setLeft(lab);
		this.setCenter(tf);
		this.setBottom(button);
		button.setOnAction((event) -> {
			SauvegardeRepertoire.sauvegarder(RepertoireGUI.repertoire, tf.getText());
			stage.setScene(RepertoireGUI.menuScene);
		});
	}

}

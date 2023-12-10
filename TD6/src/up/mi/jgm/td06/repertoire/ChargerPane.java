package up.mi.jgm.td06.repertoire;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import up.mi.jd.td05.repertoire.ParserRepertoire;
import up.mi.jd.td05.repertoire.RepertoireException;

public class ChargerPane extends BorderPane {

	public ChargerPane(Stage stage) {
		Label lab = new Label("Chemin du fichier : ");
		TextField tf = new TextField();
		Button button = new Button("Charger");
		this.setLeft(lab);
		this.setCenter(tf);
		this.setBottom(button);
		button.setOnAction((event) -> {
			try {
				RepertoireGUI.repertoire = ParserRepertoire.parser(tf.getText());
			} catch (RepertoireException e) {
				System.err.println(e.getMessage());
				System.exit(1);
			}
			stage.setScene(RepertoireGUI.menuScene);
		});
	}

}

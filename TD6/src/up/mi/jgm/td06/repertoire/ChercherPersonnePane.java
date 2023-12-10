package up.mi.jgm.td06.repertoire;

import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ChercherPersonnePane extends FlowPane {

	public ChercherPersonnePane(Stage stage) {
		super(Orientation.VERTICAL);
		FlowPane fp1 = new FlowPane();
		TextField tf1 = new TextField();
		fp1.getChildren().addAll(new Label("Numéro : "), tf1);
		Label lab = new Label();
		Button button = new Button("Chercher");
		this.getChildren().addAll(fp1, lab, button);

		button.setOnAction((event) -> {
			lab.setText(RepertoireGUI.repertoire.cherchePersonne(tf1.getText()));
			button.setText("Menu");
			button.setOnAction((event2) -> {
				stage.setScene(RepertoireGUI.menuScene);
			});
		});
	}

}

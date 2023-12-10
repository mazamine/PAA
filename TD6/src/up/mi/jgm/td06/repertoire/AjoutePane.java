package up.mi.jgm.td06.repertoire;

import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class AjoutePane extends FlowPane {

	public AjoutePane(Stage stage) {
		super(Orientation.VERTICAL);
		FlowPane fp1 = new FlowPane();
		FlowPane fp2 = new FlowPane();
		FlowPane fp3 = new FlowPane();
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		TextField tf3 = new TextField();
		fp1.getChildren().addAll(new Label("Prénom : "), tf1);
		fp2.getChildren().addAll(new Label("Nom :      "), tf2);
		fp3.getChildren().addAll(new Label("Numéro: "), tf3);
		Button button = new Button("Ajouter contact");
		this.getChildren().addAll(fp1, fp2, fp3, button);

		button.setOnAction((event) -> {
			RepertoireGUI.repertoire.addPersonne(tf1.getText(), tf2.getText(), tf3.getText());
			stage.setScene(RepertoireGUI.menuScene);
		});
	}

}

package up.mi.jgm.td06.repertoire;

import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ChercherNumeroPane extends FlowPane {
	public ChercherNumeroPane(Stage stage) {
		super(Orientation.VERTICAL);
		FlowPane fp1 = new FlowPane();
		FlowPane fp2 = new FlowPane();
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		fp1.getChildren().addAll(new Label("Prénom : "), tf1);
		fp2.getChildren().addAll(new Label("Nom    : "), tf2);
		Label lab = new Label();
		Button button = new Button("Chercher");
		this.getChildren().addAll(fp1, fp2, lab, button);

		button.setOnAction((event) -> {
			lab.setText(RepertoireGUI.repertoire.chercheNumero(tf1.getText(), tf2.getText()));
			button.setText("Menu");
			button.setOnAction((event2) -> {
				stage.setScene(RepertoireGUI.menuScene);
			});
		});
	}
}

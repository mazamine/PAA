package up.mi.jgm.td06.repertoire;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MenuPane extends FlowPane {

	public MenuPane(Stage stage) {
		Button buttonCharger = new Button("Charger");
		buttonCharger.setOnAction((event) -> {
			stage.setScene(new Scene(new ChargerPane(stage)));
		});

		Button buttonSauver = new Button("Sauver");
		buttonSauver.setOnAction((event) -> {
			stage.setScene(new Scene(new SauverPane(stage)));
		});

		Button buttonAjouter = new Button("Ajouter Contact");
		buttonAjouter.setOnAction((event) -> {
			stage.setScene(new Scene(new AjoutePane(stage)));
		});

		Button buttonCherchePersonne = new Button("Chercher une personne");
		buttonCherchePersonne.setOnAction((event) -> {
			stage.setScene(new Scene(new ChercherPersonnePane(stage)));
		});

		Button buttonChercherNumero = new Button("Chercher un numéro");
		buttonChercherNumero.setOnAction((event) -> {
			stage.setScene(new Scene(new ChercherNumeroPane(stage)));
		});

		Button buttonAfficher = new Button("Afficher");
		buttonAfficher.setOnAction((event) -> {
			stage.setScene(new Scene(new AfficherPane(stage)));
		});

		this.getChildren().addAll(buttonCharger, buttonSauver, buttonAjouter, buttonCherchePersonne,
				buttonChercherNumero, buttonAfficher);
	}

}

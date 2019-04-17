package Utflow;

import Utflow.Panneaux.PanneauCentre;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        PanneauPrincipale root = new PanneauPrincipale();
        Scene scene = new Scene(root, 800,600);

        stage.setTitle("Logiciel de simulation hydraulique");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

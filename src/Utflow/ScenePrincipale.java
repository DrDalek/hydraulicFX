package Utflow;

import Utflow.Panneau.PanneauBas.PaneTurbine;
import Utflow.Panneau.PanneauCentre;
import Utflow.Panneau.PanneauResultat;
import Utflow.Panneau.PanneauSelection;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class ScenePrincipale extends BorderPane {

    Pane pGauche;
    Pane pDroit;
    Pane pCentre;
    TitledPane pBas;

    public ScenePrincipale(){
        init();
    }

    private void init() {

        pGauche = new PanneauSelection();
        pDroit = new PanneauResultat();
        pCentre = new PanneauCentre();

        pBas = new PaneTurbine();

        this.setLeft(pGauche);
        this.setRight(pDroit);
        this.setCenter(pCentre);
        this.setBottom(pBas);

    }
}

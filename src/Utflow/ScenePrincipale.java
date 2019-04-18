package Utflow;

import Utflow.Panneaux.PanneauCentre;
import Utflow.Panneaux.PanneauResultat;
import Utflow.Panneaux.PanneauSelection;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class ScenePrincipale extends BorderPane {

    Pane pGauche;
    Pane pDroit;
    Pane pCentre;
    Pane pBas;

    public ScenePrincipale(){

        init();

    }

    private void init() {

        pGauche = new PanneauSelection();
        pDroit = new PanneauResultat();
        pCentre = new PanneauCentre();

        this.setLeft(pGauche);
        this.setRight(pDroit);
        this.setCenter(pCentre);

    }
}

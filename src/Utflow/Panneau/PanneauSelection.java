package Utflow.Panneau;

import Utflow.Disque;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class PanneauSelection extends Pane {

    private GridPane grid;

    public PanneauSelection(){
        init();
    }

    private void init() {

        Insets espacementLabel = new Insets(5,5,5,5);

        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(espacementLabel);
        grid.setVgap(5);
        grid.setHgap(10);

        Label[] appLabel = {
                new Label("Pompe"),
                new Label("Turbine"),
                new Label("Jointure"),
                new Label("Valve")
        };

        Disque[] appDisque = {
                new Disque(Color.rgb(67, 160, 53)),
                new Disque(Color.RED),
                new Disque(Color.rgb(222, 146, 15)),
                new Disque(Color.BLUE)
        };

        //Style des labels
        for(int i=0; i<appLabel.length; i++){
            appLabel[i].setPadding(espacementLabel);
            appLabel[i].setBorder(new Border(styleBordure(appDisque[i].getColor())));
        }

        //Positionnement des éléments dans le grid et ajout
        for(int i=0; i<appLabel.length; i++){
            grid.addRow(i, appLabel[i], appDisque[i]);
        }

        this.getChildren().add(grid);
    }

    private BorderStroke styleBordure(Color c){
        return new BorderStroke(c, BorderStrokeStyle.SOLID, new CornerRadii(1), new BorderWidths(2));
    }
}

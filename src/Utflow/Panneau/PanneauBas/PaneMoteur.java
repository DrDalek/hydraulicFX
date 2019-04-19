package Utflow.Panneau.PanneauBas;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public abstract class PaneMoteur extends TitledPane {

    //Paramètres statiques du moteur
    private final static double H_DEFAUT = 10.0; // hauteur : unité [m]
    private final static double H_MIN = 0.0;
    private final static double H_MAX = 50.0;

    //Attribut du panneau
    private GridPane grid;
    private Spinner<Double> saisieHauteur; //private JLabel textHauteur;

    //Attribut du moteur
    private double hauteur;
    private String nom;

    public PaneMoteur(){
        nom = nomMoteur();
        initPanel();
    }

    private void initPanel(){

        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(5);
        grid.setHgap(15);

        setContent(grid);
        setText("Configuration de la "+ nom);
        setAlignment(Pos.CENTER);
        setCollapsible(false);

        Label lHauteur = new Label("Hauteur de la "+ nom +" [m]");
        SpinnerValueFactory<Double> factoryH = new SpinnerValueFactory.DoubleSpinnerValueFactory(H_MIN, H_MAX, H_DEFAUT, 1.0);
        saisieHauteur = new Spinner<>(factoryH);
        saisieHauteur.setEditable(true);

        grid.addRow(0,lHauteur, saisieHauteur);
        getChildren().add(grid);
    }

    protected abstract String nomMoteur();
}

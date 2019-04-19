package Utflow.Panneau.PanneauBas;

import Utflow.Calcul.App;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class PaneConduit extends TitledPane {

    public final static String TITRE = "Configuration d'un conduit";

    public final static double DIAMETRE_DEFAUT = 20.0;
    public final static double DIAMETRE_MIN = 0.0;
    public final static double DIAMETRE_MAX = 100.0;

    public double LONGUEUR_DEFAUT = 20.0;
    public double LONGUEUR_MIN = 0.0;
    public double LONGUEUR_MAX = 60.0;

    public final static double K_DEFAUT = 0.025;
    public final static double K_MIN = 0.000;
    public final static double K_MAX = 2.000;

    GridPane grid;
    Spinner<Double> saisieDiametre = new Spinner<>();
    Spinner<Double> saisieLongeur = new Spinner<>();
    Spinner<Double> saisieK = new Spinner<>();

    private double diametre;
    private double longueur;
    private double k; //Coefficient de perte de charge régulière
    private App AppSuivant;
    private App AppPrecedent;

    public PaneConduit(){

        this.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(5);
        grid.setHgap(15);

        setContent(grid);
        setText(TITRE);
        setAlignment(Pos.CENTER);
        setCollapsible(false);

        Label titreDiametre = new Label("Diamètre [m]");
        Label titreLongueur = new Label("Longueur [m]");
        Label titreK = new Label("Coefficient de perte de charge");

        //Initialisation des Spinners
        initSpinner();

        //Ajout des objets de saisies dans le grid
        grid.addColumn(0,titreDiametre,titreLongueur);
        grid.addColumn(1,saisieDiametre, saisieLongeur);
        grid.addColumn(2, titreK);
        grid.addColumn(3,saisieK);

        getChildren().add(grid);
    }

    private void initSpinner() {
        SpinnerValueFactory<Double> factoryD = new SpinnerValueFactory.DoubleSpinnerValueFactory(DIAMETRE_MIN, DIAMETRE_MAX, DIAMETRE_DEFAUT, 5.0);
        saisieDiametre.setValueFactory(factoryD);
        saisieDiametre.setEditable(true);

        SpinnerValueFactory<Double> factoryL = new SpinnerValueFactory.DoubleSpinnerValueFactory(LONGUEUR_MIN, LONGUEUR_MAX, LONGUEUR_DEFAUT, 5.0);
        saisieLongeur.setValueFactory(factoryL);
        saisieLongeur.setEditable(true);

        SpinnerValueFactory<Double> factoryK = new SpinnerValueFactory.DoubleSpinnerValueFactory(K_MIN, K_MAX, K_DEFAUT, 0.025);
        saisieK.setValueFactory(factoryK);
        saisieK.setEditable(true);
    }
}

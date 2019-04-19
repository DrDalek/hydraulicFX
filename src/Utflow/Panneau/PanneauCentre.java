package Utflow.Panneau;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;

public class PanneauCentre extends Pane {

    private NumberAxis xAxis;
    private NumberAxis yAxis;

    public PanneauCentre(){
        setWidth(600);
        setHeight(300);

        xAxis = new NumberAxis("Longueur[m]",0.0,60.0, 10.0);
        yAxis = new NumberAxis("Hauteur [m]", 0.0, 30.0, 10.0);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Graphe");


        XYChart.Series lignePiezo = new XYChart.Series();
        XYChart.Series ligneCharge = new XYChart.Series();
        lignePiezo.setName("Lignes Piezo");
        ligneCharge.setName("Lignes de charge");

        lignePiezo.getData().add(new XYChart.Data<>(0,30));
        lignePiezo.getData().add(new XYChart.Data<>(10,20));
        lignePiezo.getData().add(new XYChart.Data<>(20,22));
        lignePiezo.getData().add(new XYChart.Data<>(30,25));
        lignePiezo.getData().add(new XYChart.Data<>(40,22));
        lignePiezo.getData().add(new XYChart.Data<>(50,15));
        lignePiezo.getData().add(new XYChart.Data<>(60,16));

        ligneCharge.getData().add(new XYChart.Data<>(0,20));
        ligneCharge.getData().add(new XYChart.Data<>(10,10));
        ligneCharge.getData().add(new XYChart.Data<>(20,12));
        ligneCharge.getData().add(new XYChart.Data<>(30,15));
        ligneCharge.getData().add(new XYChart.Data<>(40,12));
        ligneCharge.getData().add(new XYChart.Data<>(50,5));
        ligneCharge.getData().add(new XYChart.Data<>(60,6));

        lineChart.getData().add(lignePiezo);
        lineChart.getData().add(ligneCharge);
        this.getChildren().add(lineChart);

    }
}

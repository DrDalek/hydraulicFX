package Utflow.Panneau;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class PanneauResultat extends VBox {
    private Label labDebit;
    private Label labChargeTotaleMax;
    private Label labChargeTotaleMin;
    private Label labPiezoMax;
    private Label labPiezoMin;
    private Label labNivGauche;
    private Label labNivDroit;


    public PanneauResultat(){
        super();
        labDebit = new Label("50");
        labChargeTotaleMax = new Label("30");
        labChargeTotaleMin = new Label("12");
        labPiezoMax = new Label("30");
        labPiezoMin = new Label("6");
        labNivGauche = new Label("30");
        labNivDroit = new Label("20");
        init();
    }

    private void init() {

        setSpacing(5);
        setAlignment(Pos.CENTER);

        VBox debit = new VBox();
        VBox lignes = new VBox();
        VBox niveau = new VBox();

        debit.getChildren().add(new Label("Débit moyen [L/s]"));
        debit.getChildren().add(labDebit);

        lignes.getChildren().add(new Label("Ligne de charge totale [m]"));
        lignes.getChildren().add(new Label("Max : " + getLabChargeTotaleMax()));
        lignes.getChildren().add(new Label("Min : " + getChargeTotaleMin()));

        lignes.getChildren().add(new Label("Ligne piezométrique [m]"));
        lignes.getChildren().add(new Label("Max : " + getPiezoMax()));
        lignes.getChildren().add(new Label("Min : " + getPiezoMin()));

        niveau.getChildren().add(new Label("niveau des réservoirs [m]"));
        niveau.getChildren().add(new Label("Gauche : "+getNivGauche()));
        niveau.getChildren().add(new Label("Droit : "+getNivDroit()));

        getChildren().add(debit);
        getChildren().add(lignes);
        getChildren().add(niveau);
    }

    public String getDebit() {
        return labDebit.getText();
    }

    public void setDebit(String s){
        labDebit.setText(s);
    }

    public String getLabChargeTotaleMax() {
        return labChargeTotaleMax.getText();
    }

    public void setLabChargeTotaleMax(String labChargeTotaleMax) {
        this.labChargeTotaleMax.setText(labChargeTotaleMax);
    }

    public String getChargeTotaleMin() {
        return labChargeTotaleMin.getText();
    }

    public void setChargeTotaleMin(String labChargeTotaleMin) {
        this.labChargeTotaleMin.setText(labChargeTotaleMin);
    }

    public String getPiezoMin(){
        return labPiezoMin.getText();
    }

    public void setPiezoMin(String s){
        labPiezoMin.setText(s);
    }

    public String getPiezoMax(){
        return labPiezoMax.getText();
    }

    public void setPiezoMax(String s){
        labPiezoMax.setText(s);
    }

    public String getNivGauche(){
        return labNivGauche.getText();
    }

    public void setLabNivGauche(String labNivGauche) {
        this.labNivGauche.setText(labNivGauche);
    }

    public String getNivDroit(){
        return labNivDroit.getText();
    }

    public void setLabNivDroit(String labNivDroit){
        this.labNivDroit.setText(labNivDroit);
    }

}

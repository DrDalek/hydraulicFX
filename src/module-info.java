module hydrauliqueFX {
    requires javafx.fxml;
    requires javafx.controls;

    opens sample to javafx.fxml;
    opens Utflow to javafx.fxml;

    exports Utflow;
    exports sample;
}
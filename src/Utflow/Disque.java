package Utflow;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Disque extends Circle {

    Color color;

    public Disque(Color c){
        color = c;
        setFill(color);
        setRadius(5);
    }

    public Color getColor() {
        return color;
    }
}

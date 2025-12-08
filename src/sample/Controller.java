package sample;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Controller {
    @FXML
    private Canvas mainCanvas;

    @FXML
    public void initialize() {
        // safe to use your @FXML canvas here
        GraphicsContext gc = mainCanvas.getGraphicsContext2D();
        MyLine line = new MyLine(10, 10 , 20, 20);
        line.drawIt(gc);
    }

}

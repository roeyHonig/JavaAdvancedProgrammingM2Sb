package sample;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Controller {
    @FXML
    private Canvas mainCanvas;

    @FXML
    public void initialize() {
        ArrayList<MyShape> shapes = new ArrayList<>();
        ArrayList<MyShape> clonedShapes = new ArrayList<>();
        GraphicsContext gc = mainCanvas.getGraphicsContext2D();
        // Add shapes
        shapes.add(getRandomRedLine());
        shapes.add(getRandomRedLine());
        shapes.add(getRandomRedOval());
        shapes.add(getRandomRedOval());
        shapes.add(getRandomRedRect());
        shapes.add(getRandomRedRect());
        drawShapes(shapes, gc);
        // clone the shapes
        for (MyShape shape: shapes
        ) {
            try {
                MyShape clonedShape = shape.clone();
                clonedShape.setX1(shape.getX1() + 10);
                clonedShape.setY1(shape.getY1() + 10);
                clonedShape.setX2(shape.getX2() + 10);
                clonedShape.setY2(shape.getY2() + 10);
                clonedShape.setColor(Color.GREEN);
                clonedShapes.add(clonedShape);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        drawShapes(clonedShapes, gc);
    }

    private void drawShapes(ArrayList<MyShape> shapes, GraphicsContext gc) {
        for (MyShape shape: shapes
             ) {
            shape.drawIt(gc);
        }
    }

    private MyLine getRandomRedLine() {
        return new MyLine(Math.random() * 200, Math.random() * 200 , Math.random() * 200, Math.random() * 200, Color.RED);
    }

    private MyOval getRandomRedOval() {
        return new MyOval(Math.random() * 200, Math.random() * 200 , Math.random() * 200, Math.random() * 200, Color.RED);
    }

    private MyRectangle getRandomRedRect() {
        return new MyRectangle(Math.random() * 200, Math.random() * 200 , Math.random() * 200, Math.random() * 200, Color.RED);
    }
}

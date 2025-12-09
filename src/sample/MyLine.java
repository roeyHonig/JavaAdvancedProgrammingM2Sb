package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyLine extends MyShape {
    public MyLine(double x1, double y1, double x2, double y2, Color c) {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
        setColor(c);
    }

    @Override
    public void drawIt(GraphicsContext gc) {
        gc.setStroke(getColor());
        gc.strokeLine(getX1(), getY1(), getX2(), getY2());
    }

    @Override
    protected MyShape clone() throws CloneNotSupportedException {
        return new MyLine(getX1(), getY1(), getX2(), getY2(), getColor());
    }
}

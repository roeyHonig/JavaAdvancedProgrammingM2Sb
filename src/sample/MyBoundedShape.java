package sample;

public abstract class MyBoundedShape extends MyShape {
    public double getWidth(double x1, double x2) {
        return Math.abs(x2 - x1);
    }

    public double getHeight(double y1, double y2) {
        return Math.abs(y2 - y1);
    }

    public double getCenterX(double x1, double x2) {
        return (x1 + x2) / 2.0;
    }

    public double getCenterY(double y1, double y2) {
        return (y1 + y2) / 2.0;
    }
}

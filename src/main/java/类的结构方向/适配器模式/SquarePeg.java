package 类的结构方向.适配器模式;

public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getSquare() {
        return Math.pow(width, 2);
    }

    public double getWidth() {
        return width;
    }
}

package 类的结构方向.适配器模式;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        double width = squarePeg.getWidth();
        return Math.sqrt(Math.pow(width / 2, 2) + Math.pow(width / 2, 2));
    }
}

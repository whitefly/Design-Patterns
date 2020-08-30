package 类的结构方向.适配器模式;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg peg) {
        return peg.getRadius() <= radius;
    }
}

package 行为方向.visitor模式.v2;

public class Mouse extends ComputePart {
    public Mouse(double price) {
        super(price);
    }

    @Override
    double accept(Visitor visitor) {
        return visitor.doForMouse(this);
    }


}

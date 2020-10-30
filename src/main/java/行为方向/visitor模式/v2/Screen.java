package 行为方向.visitor模式.v2;

public class Screen extends ComputePart {
    public Screen(double price) {
        super(price);
    }

    @Override
    double accept(Visitor visitor) {
        return visitor.doForScreen(this);
    }

}

package 行为方向.visitor模式.v2;

public class Memory extends ComputePart {
    public Memory(double price) {
        super(price);
    }

    @Override
    double accept(Visitor visitor) {
        return visitor.doForMemory(this);
    }


}

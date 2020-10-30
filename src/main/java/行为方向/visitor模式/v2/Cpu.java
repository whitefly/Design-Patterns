package 行为方向.visitor模式.v2;

public class Cpu extends ComputePart {
    public Cpu(double price) {
        super(price);
    }

    @Override
    double accept(Visitor visitor) {
        return visitor.doForCpu(this);
    }


}

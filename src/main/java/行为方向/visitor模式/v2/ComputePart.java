package 行为方向.visitor模式.v2;


/**
 * 每个配件,不同的顾客种类买,需要打不同的折扣
 * ①架构师要去不能大改动原有的代码(怕引入代码缺陷)
 * ②尝试每个类写一个调用者,只给类加一个accept()方法,打折的过程由visitor来获取原始价格,然后打折
 */

public abstract class ComputePart {
    public ComputePart(double price) {
        this.price = price;
    }

    private double price;

    public double getPrice() {
        return price;
    }

    abstract double accept(Visitor visitor);
}





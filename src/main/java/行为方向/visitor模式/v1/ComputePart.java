package 行为方向.visitor模式.v1;


/**
 * 每个配件,不同的顾客种类买,需要打不同的折扣
 * ①架构师要去不能大改动原有的代码(怕引入代码缺陷)
 * ②根据你的水平,你大致只能新写一个方法getPrice和discountRate,判断不同的顾客类型,来完成打折计算
 */

public abstract class ComputePart {
    public ComputePart(double price) {
        this.price = price;
    }

    private double price;

    public double getPrice(CustomerType type) {
        return discountRate(type) * price;
    }


    public double discountRate(CustomerType type) {
        switch (type) {
            case Normal:
                return 1.0;
            case Vip:
                return 0.9;
            case Officer:
                return 0.8;
            default:
                return 1.1;
        }
    }

}





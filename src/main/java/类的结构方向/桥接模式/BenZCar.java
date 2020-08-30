package 类的结构方向.桥接模式;

public class BenZCar extends AbstractCar {

    @Override
    void run() {
        super.run();
        System.out.println("我是BENZ");
    }
}

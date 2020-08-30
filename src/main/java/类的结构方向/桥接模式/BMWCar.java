package 类的结构方向.桥接模式;

public class BMWCar extends AbstractCar {

    @Override
    void run() {
        super.run();
        System.out.println("我是BMW");
    }
}

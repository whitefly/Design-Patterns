package 类的结构方向.桥接模式;

public class Auto extends Transmission {

    @Override
    void gear() {
        System.out.println("自动挡");
    }
}

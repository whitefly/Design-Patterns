package 类的结构方向.桥接模式;

public class Manual extends Transmission {
    @Override
    void gear() {
        System.out.println("手动挡");
    }
}

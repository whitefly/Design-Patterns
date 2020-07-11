package 类的结构方向.代理模式.静态代理;

public class Demo {
    public static void main(String[] args) {
        Walker walker = new WalkerSimpleImpl();
        WalkProxy proxy = new WalkProxy();
        proxy.setObj(walker);
        proxy.walk();
    }
}

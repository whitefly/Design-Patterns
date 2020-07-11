package 类的结构方向.代理模式.静态代理;

public class WalkerSimpleImpl implements Walker {
    @Override
    public void walk() {
        System.out.println("调用walk方法");
    }
}

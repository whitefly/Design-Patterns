package 类的结构方向.代理模式.静态代理;

public class WalkProxy implements Walker {
    private Walker obj;

    @Override

    public void walk() {
        before();
        obj.walk();
        after();
    }

    private void before() {
        System.out.println("调用前方法");
    }

    private void after() {
        System.out.println("调用后方法");
    }

    public void setObj(Walker obj) {
        this.obj = obj;
    }
}


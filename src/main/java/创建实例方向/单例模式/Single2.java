package 创建实例方向.单例模式;

public class Single2 {

    static int a = 12;
    static int b;

    static {
        b = 100;
        System.out.println("nihao ");
        System.out.println("good");
    }

    private Single2() {
    }

    public static Single2 getInstance() {
        return SingletonHolder.single2;
    }

    private static class SingletonHolder {
        private static final Single2 single2 = new Single2();
    }

    public static void main(String[] args) {

    }
}

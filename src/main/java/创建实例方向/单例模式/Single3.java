package 创建实例方向.单例模式;

public enum Single3 {
    INSTANCE;

    public static Single3 getInstance() {
        return INSTANCE;
    }

    private void show() {
        System.out.println("ok");
    }

}

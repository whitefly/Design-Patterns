package 单例模式;

public class Single {
    private static volatile Single instance = null;  //设置volatile防止指令重排

    private Single() {
    }

    public static Single getInstance() {
        //饿汉式双边检查
        if (instance == null) {
            synchronized (Single.class) {
                if (instance == null) {
                    instance = new Single();
                }
            }
        }
        return instance;
    }
}

package 创建实例方向.工厂模式;

public class SendFatory {
    private static final Sender sender = new Bsender();

    static Sender getInstance() {
//        return new Asender();
        return sender;
    }
}

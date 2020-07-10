package 创建型.工厂模式;

public class SendFatory {
    private static final Sender sender = new Bsender();

    static Sender getInstance() {
//        return new Asender();
        return sender;
    }
}

package 创建型.工厂模式;

public class Bsender implements Sender {
    @Override
    public void send(String content) {
        System.out.println("我是联通, 我要发短信....->200行");
    }
}

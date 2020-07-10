package 创建型.工厂模式;

public class Asender implements Sender {

    public void send(String note) {
        System.out.println("我是电信, 一大串xx代码, -> A服务器 -> 发短信->返回成功");
    }

}

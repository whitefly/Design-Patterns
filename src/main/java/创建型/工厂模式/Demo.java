package 创建型.工厂模式;

public class Demo {
    public static void main(String[] args) {
        //-------------------
        String content = "你中了100w.去领奖";
       Sender sender = SendFatory.getInstance();
        sender.send(content);


        String content2 = "你中了200w.去领奖";
       Sender sender2 = SendFatory.getInstance();
        sender2.send(content2);


        String content3 = "你中了300w.去领奖";
       Sender sender3 = SendFatory.getInstance();
        sender3.send(content3);


        String content4 = "你中了400w.去领奖";
       Sender sender4 = SendFatory.getInstance();
        sender4.send(content4);


        String content5 = "你中了500w.去领奖";
       Sender sender5 = SendFatory.getInstance();
        sender5.send(content5);

        String content6 = "你中了600w.去领奖";
       Sender sender6 = SendFatory.getInstance();
        sender6.send(content6);

        System.out.println(sender2 == sender6);

        //------------------
    }
}

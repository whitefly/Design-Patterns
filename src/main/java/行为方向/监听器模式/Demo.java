package 行为方向.监听器模式;

public class Demo {
    public static void main(String[] args) {
        Publisher caster = new SimplePublisher();
        caster.addListener(new RainListener());
        caster.addListener(new SnowListener());

        //发送消息触发监听器
        caster.publishMsg(new RainMessage());
        System.out.println();
        caster.publishMsg(new SnowMessage());
    }
}

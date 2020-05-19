package 监听器模式;

public class Demo {
    public static void main(String[] args) {
        EventCaster caster = new SimpleEventCaster();
        caster.addListener(new RainListener());
        caster.addListener(new SnowListener());

        //发送消息触发监听器
        caster.castEvent(new RainEvent());
        caster.castEvent(new SnowEvent());
    }
}

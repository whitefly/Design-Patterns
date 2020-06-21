package 监听器模式;

public class SimpleEventCaster extends AbsEventCaster {

    @Override
    public void doBefore() {
        System.out.println("处理前执行");
    }

    @Override
    public void doAfter() {
        System.out.println("处理后执行");
    }

}

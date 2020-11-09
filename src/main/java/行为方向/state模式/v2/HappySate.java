package 行为方向.state模式.v2;

public class HappySate implements State {
    @Override
    public void say() {
        System.out.println("笑着说");
    }

    @Override
    public void walk() {
        System.out.println("笑着走");
    }
}

package 行为方向.模板方法;

public abstract class App {

    abstract void step1(); //等待被实现

    abstract void step2();

    abstract void step3();

    public void start() {
        step1();
        step2();
        step3();
    }
}

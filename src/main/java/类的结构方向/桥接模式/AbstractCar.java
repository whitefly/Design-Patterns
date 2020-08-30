package 类的结构方向.桥接模式;

public abstract class AbstractCar {
    //确定手动挡,还是自动挡,直接放在Car中(且不是继承)
    Transmission gear;

    public AbstractCar() {
    }


    public void setGear(Transmission gear) {
        this.gear = gear;
    }

    void run() {
        gear.gear();
    }

}

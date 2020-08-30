package 类的结构方向.桥接模式;

public class Demo {
    public static void main(String[] args) {
        BenZCar car1 = new BenZCar();
        car1.setGear(new Auto());


        BenZCar car2 = new BenZCar();
        car2.setGear(new Manual());

        car1.run();
        System.out.println();
        car2.run();


    }
}

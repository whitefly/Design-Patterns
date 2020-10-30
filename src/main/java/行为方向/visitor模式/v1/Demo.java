package 行为方向.visitor模式.v1;

public class Demo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCpu(new Cpu(2.0));
        computer.setMemory(new Memory(8.0));
        computer.setMouse(new Mouse(10.0));

        double v = computer.totalPrice(CustomerType.Vip);
        System.out.println(v);
    }
}

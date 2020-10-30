package 行为方向.visitor模式.v2;

public class Demo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCpu(new Cpu(10.0));
        computer.setMemory(new Memory(10.0));
        computer.setMouse(new Mouse(10.0));
        computer.setScreen(new Screen(10.0));

        double v = computer.totalPrice(new NormalVisitor());
        System.out.println(v);
    }
}

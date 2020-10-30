package 行为方向.visitor模式.v2;

public class Computer {
    private Cpu cpu;
    private Memory memory;
    private Mouse mouse;
    private Screen screen;

    public double totalPrice(Visitor visitor) {
        double v1 = cpu.accept(visitor);
        double v2 = memory.accept(visitor);
        double v3 = mouse.accept(visitor);
        double v4 = screen.accept(visitor);
        return v1 + v2 + v3 + v4;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}

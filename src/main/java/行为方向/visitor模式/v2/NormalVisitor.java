package 行为方向.visitor模式.v2;


public class NormalVisitor implements Visitor {
    @Override
    public double doForCpu(Cpu cpu) {
        return cpu.getPrice() * 0.9;
    }

    @Override
    public double doForMemory(Memory memory) {
        return memory.getPrice() * 0.9;
    }

    @Override
    public double doForMouse(Mouse mouse) {
        return mouse.getPrice() * 0.9;
    }

    @Override
    public double doForScreen(Screen screen) {
        return screen.getPrice() * 0.9;
    }
}

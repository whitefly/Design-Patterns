package 行为方向.visitor模式.v2;

public interface Visitor {
    double doForCpu(Cpu cpu);

    double doForMemory(Memory memory);

    double doForMouse(Mouse mouse);

    double doForScreen(Screen screen);

}

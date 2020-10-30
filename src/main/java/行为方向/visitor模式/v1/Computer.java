package 行为方向.visitor模式.v1;

import java.lang.reflect.Field;

/**
 * 这里存放全有的组件
 */
public class Computer {
    private Cpu cpu;
    private Memory memory;
    private Mouse mouse;
    private Screen Screen;

    public double totalPrice(CustomerType type) {
        double total = 0.0;
        for (Field field : this.getClass().getDeclaredFields()) {
            Class<?> classType = field.getType();
            if (ComputePart.class.isAssignableFrom(classType)) {
                try {
                    ComputePart o = (ComputePart) field.get(this);
                    if (o != null) {
                        total += o.getPrice(type);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return total;
    }


    public ComputePart getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public 行为方向.visitor模式.v1.Screen getScreen() {
        return Screen;
    }

    public void setScreen(行为方向.visitor模式.v1.Screen screen) {
        Screen = screen;
    }
}

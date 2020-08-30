package 类的结构方向.组合模式;

import java.awt.*;

//画出的形状基本接口, 定位+宽+高
public interface Shape {
    int getX();

    int getY();

    int getWidth();

    int getHeight();

    void move(int x, int y);

    boolean isInsideBounds(int x, int y);

    void select();

    void unSelect();

    boolean isSelected();

    void paint(Graphics graphics);

}

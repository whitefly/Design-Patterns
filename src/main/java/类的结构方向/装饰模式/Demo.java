package 类的结构方向.装饰模式;

import java.io.*;
import java.util.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        String path = "/Users/zhouang/Desktop/done2/shell练习/demo.txt";

        final FileSource fileSource = new FileSource(path);
        final EncodeDecorater encodeDecorater = new EncodeDecorater(fileSource);
        encodeDecorater.writeDate("我叫周昂");


        System.out.println("OK");

    }
}

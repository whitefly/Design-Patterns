package 类的结构方向.adapter模式;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws IOException {
        String path = "/Users/zhouang/Desktop/done2/shell练习/argsFile.txt";
        final FileInputStream fileInputStream = new FileInputStream(path); // 老代码都是字节流,想把字节流转为字符流,需要做个适配
        final InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader br = new BufferedReader(inputStreamReader);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }


    }
}

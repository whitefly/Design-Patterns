package 类的结构方向.外观模式;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade(); //调用者只需要对外观模式操作即可
        //将ogg格式转换为map4格式
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");


    }
}

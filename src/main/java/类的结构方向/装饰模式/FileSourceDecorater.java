package 类的结构方向.装饰模式;

import java.io.IOException;

public abstract class FileSourceDecorater {
    private FileSource fileSource;

    public FileSourceDecorater(FileSource fileSource) {
        this.fileSource = fileSource;
    }


    void writeDate(String content) throws IOException {
        fileSource.writeDate(content);
    }


    String readDate() throws IOException {
        return fileSource.readDate();
    }


}

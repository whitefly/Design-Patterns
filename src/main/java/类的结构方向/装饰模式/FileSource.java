package 类的结构方向.装饰模式;

import java.io.*;

public class FileSource {
    private final String fileName;

    public FileSource(String fileName) {
        this.fileName = fileName;
    }

    public String readDate() throws IOException {
        StringBuilder sb = new StringBuilder();
        try (final BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        }
        return sb.toString();
    }


    void writeDate(String content) throws IOException {
        try (final BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content); //BufferedWriter.close()时会预先自动flush()
        }
    }
}

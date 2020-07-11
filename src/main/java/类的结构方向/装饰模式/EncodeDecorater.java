package 类的结构方向.装饰模式;

import java.io.IOException;
import java.util.Base64;

public class EncodeDecorater extends FileSourceDecorater {
    private final Base64.Decoder decoder = Base64.getDecoder();
    private final Base64.Encoder encoder = Base64.getEncoder();


    public EncodeDecorater(FileSource fileSource) {
        super(fileSource);
    }

    @Override
    void writeDate(String content) throws IOException {
        super.writeDate(encode(content));
    }

    @Override
    String readDate() throws IOException {
        return decode(super.readDate());

    }


    private String encode(String content) {
        return encoder.encodeToString(content.getBytes());
    }

    private String decode(String content) {
        return new String(decoder.decode(content));
    }
}

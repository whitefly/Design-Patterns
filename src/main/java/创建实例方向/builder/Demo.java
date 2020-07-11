package 创建实例方向.builder;

public class Demo {

    public static void main(String[] args) {
        DbConfig learn = new DbConfig.Builder().setDbName("learn").setUrl("127.0.0.1").setPort(6310).build();
        System.out.println(learn);

    }
}

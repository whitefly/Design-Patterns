package 类的结构方向.桥接模式;

import java.sql.*;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        BenZCar car1 = new BenZCar();
        car1.setGear(new Auto());


        BenZCar car2 = new BenZCar();
        car2.setGear(new Manual());

        car1.run();
        System.out.println();
        car2.run();

        // 1. 注册JDBC驱动,// 反射机制加载驱动类
        Class.forName("com.mysql.jdbc.Driver");
        String DB_URL = "jdbc:mysql://127.0.0.1/learn";
        String USER = "root";
        String PASS = "";
        String sql = "select * from Accounts";


        // 2. 获取连接Connection
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

        // 3. 获取sql语句的对象Statement
        Statement stmt = conn.createStatement();

        // 4. 执行sql语句，并返回结果
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            int anInt = rs.getInt(1);
            System.out.println(anInt);
        }


    }
}

package 行为方向.state模式.v2;

public class Demo {
    public static void main(String[] args) {
        Client client = new Client(new SadState());
        client.say();

        Client client1 = new Client(new HappySate());
        client1.walk();
    }
}

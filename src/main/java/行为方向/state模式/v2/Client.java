package 行为方向.state模式.v2;

public class Client {
    State state;

    public Client(State state) {
        this.state = state;
    }

    public void say() {
        state.say();
    }

    public void walk() {
        state.walk();
    }

}

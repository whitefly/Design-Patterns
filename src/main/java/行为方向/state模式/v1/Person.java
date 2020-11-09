package 行为方向.state模式.v1;

public class Person {
    public enum Emotion {happy, sad}

    private Emotion emotion;

    public Person(Emotion emotion) {
        this.emotion = emotion;
    }

    public void say() {
        switch (emotion) {
            case sad:
                System.out.println("哭着说");
                break;
            case happy:
                System.out.println("笑着说");
                break;
        }
    }

    public void walk() {
        switch (emotion) {
            case sad:
                System.out.println("哭着走");
                break;
            case happy:
                System.out.println("笑着走");
                break;
        }
    }
}

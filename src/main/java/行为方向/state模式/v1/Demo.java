package 行为方向.state模式.v1;


public class Demo {
    public static void main(String[] args) {
        Person p = new Person(Person.Emotion.happy);

        p.say();

        Person p1 = new Person(Person.Emotion.sad);
        p1.walk();
    }
}

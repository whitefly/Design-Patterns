package 创建实例方向.原型模式;


public class Student extends Person {
    int score;
    String school;

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student clone = (Student) super.clone();
        clone.school = school;
        clone.score = score;
        return clone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", school='" + school + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

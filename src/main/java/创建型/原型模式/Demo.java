package 创建型.原型模式;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        student.school = "江陵中学";
        student.name = "周昂";
        student.score = 100;
        student.age = 18;

        Student clone = (Student) student.clone();
        System.out.println(clone); //Student{score=100, school='江陵中学', name='周昂', age=18}
        System.out.println(student == clone); //false

    }
}

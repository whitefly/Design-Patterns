package 创建实例方向.原型模式;


class Person implements Cloneable {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();
        clone.name = name;
        clone.age = age;
        return clone;
    }
}
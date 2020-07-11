package 类的结构方向.代理模式.cglib动态代理;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

public class Demo {

    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/zhouang/Desktop/项目/DesignPatterns/src/main/java/类的结构方式.代理模式/cglib动态代理");

        Person p = new Person();
        MyInvoker s = new MyInvoker();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(p.getClass());  //设置父类
        enhancer.setCallback(s); //设置Invoker
        Person subP = (Person) enhancer.create();  //创建继承了Person的子类

        subP.walk();

    }
}

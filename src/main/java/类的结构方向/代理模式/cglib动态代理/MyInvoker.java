package 类的结构方向.代理模式.cglib动态代理;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyInvoker implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        methodProxy.invokeSuper(o, objects);
        after();
        return null;

    }

    void before() {
        System.out.println("--------before------");
    }

    void after() {
        System.out.println("--------after------");
    }
}

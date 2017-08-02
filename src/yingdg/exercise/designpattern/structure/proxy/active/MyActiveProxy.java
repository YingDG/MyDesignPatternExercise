package yingdg.exercise.designpattern.structure.proxy.active;

import java.beans.Beans;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by yingdg on 2017/8/2.
 */
// 动态代理模式
public class MyActiveProxy implements InvocationHandler {
    // 要代理的真实对象
    private IMyAction obj;

    public MyActiveProxy(IMyAction obj) {
        this.obj = obj;
    }

    /*
    核心为实现InvocationHandler接口方法，
    类似于aop的环绕方法
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (!Beans.isInstanceOf(proxy, IMyAction.class)) {
            return null;
        }

        /*
        判断逻辑，以达到动态实现
        会判断引用类所有的方法
         */
        String methodName = method.getName();
        if ("go".equals(methodName)) {
            System.out.println("fuck off");
             /*
            这一部分可以替换为其他实现类
             */

            return null;
        }

        // 当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        return method.invoke(obj, args);
    }

    public IMyAction getProxy() {
        /*
        核心方法：newProxyInstance
        通过 Proxy.newProxyInstance 创建的代理对象是在jvm运行时动态生成的一个对象，
        并不是nvocationHandler类型，也不是定义的那组接口的类型，
        而是在运行是动态生成的一个对象，并且命名方式都是这样的形式，以$开头，proxy为中，最后一个数字表示对象的标号。
         */
        return (IMyAction) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

    public static void main(String[] args) {
        IMyAction action = new ActionImpl();
        action.go();

        MyActiveProxy activeProxy = new MyActiveProxy(action);
        IMyAction myAction = activeProxy.getProxy();
        myAction.go();
        myAction.back();
    }
}

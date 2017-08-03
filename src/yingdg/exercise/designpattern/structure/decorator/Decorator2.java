package yingdg.exercise.designpattern.structure.decorator;

/**
 * Created by YingDG on 2017/2/15.
 */
// 装饰设计模式
public class Decorator2 implements IDecorator {
    private IDecorator decorator;

    public Decorator2(IDecorator decorator) {
        this.decorator = decorator;
    }

    /*
    开闭原则的实践，在原有实现的基础上增加了同一接口的不同实现。

    常用的场景是工具包的相关方法根据业务场景做二次封装。
     */
    @Override
    public void go() {
        decorator.go();
        System.out.println("Go2");
    }

    public static void main(String[] args) {
        IDecorator decorator = new Decorator();
        decorator.go();

        IDecorator decorator2 = new Decorator2(new Decorator());
        decorator2.go();
    }
}

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

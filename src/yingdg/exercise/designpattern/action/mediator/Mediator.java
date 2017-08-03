package yingdg.exercise.designpattern.action.mediator;

/**
 * Created by YingDG on 2017/2/23.
 */
// 中介者模式
public class Mediator implements IMediator {
    private AbsA a1;
    private AbsA a2;

    public AbsA getA1() {
        return a1;
    }

    public AbsA getA2() {
        return a2;
    }

    /*
    核心：通过这个方法与中介类绑定起来，防止相关实现类单独被实例化调用
     */
    @Override
    public void create() {
        a1 = new A1(this);
        a2 = new A2(this);
    }

    @Override
    public void go() {
        a1.goA();
        a2.goA();
    }

    public static void main(String[] args) {
        IMediator mediator = new Mediator();
        mediator.create();
        mediator.go();
    }
}

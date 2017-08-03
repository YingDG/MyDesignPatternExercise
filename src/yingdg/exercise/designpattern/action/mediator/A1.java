package yingdg.exercise.designpattern.action.mediator;

/**
 * Created by YingDG on 2017/2/23.
 */
public class A1 extends AbsA {

    public A1(IMediator mediator) {
        super(mediator);
    }

    @Override
    void goA() {
        System.out.println("A1");
    }
}

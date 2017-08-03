package yingdg.exercise.designpattern.action.mediator;

/**
 * Created by YingDG on 2017/2/23.
 */
// 中介类
public abstract class AbsA {
    private IMediator mediator;

    /*
    实现类与中介类绑定
     */
    public AbsA(IMediator mediator) {
        this.mediator = mediator;
    }

    public IMediator getMediator() {
        return mediator;
    }

    abstract void goA();
}

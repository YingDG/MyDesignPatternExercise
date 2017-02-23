package yingdg.exercise.designpattern.action.mediator;

/**
 * Created by YingDG on 2017/2/23.
 */
public abstract class AbsA {
    private IMediator mediator;

    public AbsA(IMediator mediator) {
        this.mediator = mediator;
    }

    public IMediator getMediator() {
        return mediator;
    }

    abstract void goA();
}

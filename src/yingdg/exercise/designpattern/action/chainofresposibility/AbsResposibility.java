package yingdg.exercise.designpattern.action.chainofresposibility;

/**
 * Created by YingDG on 2017/2/22.
 */
public abstract class AbsResposibility {
    private IResposibility resposibility;

    public IResposibility getResposibility() {
        return resposibility;
    }

    public void setResposibility(IResposibility resposibility) {
        this.resposibility = resposibility;
    }
}

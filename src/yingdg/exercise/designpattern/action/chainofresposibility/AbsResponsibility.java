package yingdg.exercise.designpattern.action.chainofresposibility;

/**
 * Created by YingDG on 2017/2/22.
 */
// 核心类
public abstract class AbsResponsibility {
    private IResponsibility resposibility;

    public IResponsibility getResposibility() {
        return resposibility;
    }

    public void setResposibility(IResponsibility resposibility) {
        this.resposibility = resposibility;
    }
}

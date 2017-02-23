package yingdg.exercise.designpattern.action.template;

/**
 * Created by YingDG on 2017/2/22.
 */
// 策略者模式
public abstract class Father {

    public void go() {
        go1();
        go2();
    }

    protected void go1() {
        System.out.println("Father.Go1");
    }

    protected abstract void go2();

}

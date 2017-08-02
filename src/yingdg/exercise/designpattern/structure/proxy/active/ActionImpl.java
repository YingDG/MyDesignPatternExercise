package yingdg.exercise.designpattern.structure.proxy.active;

/**
 * Created by yingdg on 2017/8/2.
 */
public class ActionImpl implements IMyAction {
    @Override
    public void go() {
        System.out.println("Go");
    }

    @Override
    public void back() {
        System.out.println("back");
    }

}

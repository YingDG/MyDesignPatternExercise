package yingdg.exercise.designpattern.action.observer;

/**
 * Created by YingDG on 2017/2/22.
 */
public class ObserverA implements IObserver {
    @Override
    public void go() {
        System.out.println("A.go");
    }
}

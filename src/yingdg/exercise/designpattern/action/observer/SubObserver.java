package yingdg.exercise.designpattern.action.observer;

/**
 * Created by YingDG on 2017/2/22.
 */
public class SubObserver extends AbsSubObserver {

    public static void main(String[] args) {
        ISubObserver subObserver = new SubObserver();
        subObserver.add(new ObserverA());
        subObserver.add(new ObserverB());
        subObserver.remove(subObserver.getObserverList().get(0));

        System.out.println(subObserver.getObserverList().size() + subObserver.getObserverList().toString());
    }
}

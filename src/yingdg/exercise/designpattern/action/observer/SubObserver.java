package yingdg.exercise.designpattern.action.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YingDG on 2017/2/22.
 */
public class SubObserver implements ISubObserver {
    private List<IObserver> observerList = new ArrayList<>();

    @Override
    public void add(IObserver observer) {
        observer.go();
        observerList.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observer.go();
        observerList.remove(observer);
    }

    @Override
    public List<IObserver> getObserverList() {
        return observerList;
    }
}

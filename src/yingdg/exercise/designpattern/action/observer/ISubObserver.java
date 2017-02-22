package yingdg.exercise.designpattern.action.observer;

import java.util.List;

/**
 * Created by YingDG on 2017/2/22.
 */
public interface ISubObserver {
    void add(IObserver observer);

    void remove(IObserver observer);

    List<IObserver> getObserverList();
}

package yingdg.exercise.designpattern.action.observer;

import java.util.List;

/**
 * Created by YingDG on 2017/2/22.
 */
// 此类可理解为业务操作抽象描述
public interface ISubObserver {
    void add(IObserver observer);

    void remove(IObserver observer);

    List<IObserver> getObserverList();
}

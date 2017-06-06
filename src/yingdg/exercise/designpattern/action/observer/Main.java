package yingdg.exercise.designpattern.action.observer;

/**
 * Created by YingDG on 2017/2/22.
 */
// 观察者模式
public class Main {

    /*
    一种典型的使用是在业务类中通过接口参数切换不同的持久化类，
    以完成不同的CRUD操作。
     */
    public static void main(String[] args) {
        ISubObserver subObserver = new SubObserver();
        subObserver.add(new ObserverA());
        subObserver.add(new ObserverB());
        subObserver.remove(subObserver.getObserverList().get(0));

        System.out.println(subObserver.getObserverList().size() + subObserver.getObserverList().toString());
    }
}

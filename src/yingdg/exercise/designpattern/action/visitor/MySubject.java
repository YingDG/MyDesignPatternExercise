package yingdg.exercise.designpattern.action.visitor;

import yingdg.exercise.designpattern.action.observer.ISubObserver;

/**
 * Created by YingDG on 2017/2/23.
 */
// 访问者模式
public class MySubject implements ISubject {
    @Override
    public void receive(IVisitor visitor) {
        visitor.go(this);
    }

    @Override
    public String get() {
        return "gogogo!";
    }

    public static void main(String[] args) {
        IVisitor visitor = new MyVisit();
        ISubject subject = new MySubject();

        subject.receive(visitor);
    }
}

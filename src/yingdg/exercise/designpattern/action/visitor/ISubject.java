package yingdg.exercise.designpattern.action.visitor;

/**
 * Created by YingDG on 2017/2/23.
 */
public interface ISubject {
    void receive(IVisitor visitor);

    String get();
}

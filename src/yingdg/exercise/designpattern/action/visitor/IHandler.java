package yingdg.exercise.designpattern.action.visitor;

/**
 * Created by YingDG on 2017/2/23.
 */
// 主要业务描述
public interface IHandler {
    void receive(IVisitor visitor);

    String get();
}

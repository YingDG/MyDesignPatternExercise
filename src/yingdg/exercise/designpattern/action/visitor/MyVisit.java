package yingdg.exercise.designpattern.action.visitor;

/**
 * Created by YingDG on 2017/2/23.
 */
public class MyVisit implements IVisitor {
    @Override
    public void go(IHandler handler) {
        System.out.println(handler.get());
    }
}

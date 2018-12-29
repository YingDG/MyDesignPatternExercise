package yingdg.exercise.designpattern.action.visitor;

/**
 * Created by YingDG on 2017/2/23.
 */
public class MyVisit2 implements IVisitor {
    @Override
    public void visit(IHandler handler) {
        String get = handler.get();
        System.out.println(get + "2");
    }
}

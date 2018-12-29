package yingdg.exercise.designpattern.action.visitor;

/**
 * Created by YingDG on 2017/2/23.
 */
public interface IVisitor {
    /*
    不同访问者对数据的处理
     */
    void visit(IHandler subject);
}

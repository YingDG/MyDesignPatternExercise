package yingdg.exercise.designpattern.action.visitor;

/**
 * Created by YingDG on 2017/2/23.
 */
// 访问者模式
public class MyHandler implements IHandler {

    // 关键点
    @Override
    public void receive(IVisitor visitor) {
        visitor.visit(this);
    }

    /*
    具体的数据提供
     */
    @Override
    public String get() {
        return "gogogo!";
    }

}

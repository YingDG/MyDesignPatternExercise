package yingdg.exercise.designpattern.action.visitor;

/**
 * Created by YingDG on 2017/2/23.
 */
// 访问者模式
public class MySubject implements ISubject {

    // 关键点
    @Override
    public void receive(IVisitor visitor) {
        visitor.go(this);
    }

    @Override
    public String get() {
        return "gogogo!";
    }

    public static void main(String[] args) {
        ISubject subject = new MySubject();
        subject.receive(new MyVisit());
    }
}

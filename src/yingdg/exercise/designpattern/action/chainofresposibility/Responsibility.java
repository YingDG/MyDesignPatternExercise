package yingdg.exercise.designpattern.action.chainofresposibility;

/**
 * Created by YingDG on 2017/2/22.
 */
// 责任链模式
public class Responsibility extends AbsResponsibility implements IResponsibility {
    /*
    AbsResposibility本身具有IResposibility接口的引用，其继承类又实现了该接口
     */

    private String test;

    public Responsibility(String test) {
        this.test = test;
    }

    // 核心方法，类似于递归调用
    @Override
    public void go() {
        // 先执行自身方法
        System.out.println(test);

        // 再执行下一链节的方法
        IResponsibility resposibility = super.getResposibility();
        if (resposibility != null) {
            resposibility.go();
        }
    }

    public static void main(String[] args) {
        Responsibility responsibility = new Responsibility("A");
        Responsibility responsibility2 = new Responsibility("B");
        Responsibility responsibility3 = new Responsibility("C");

        responsibility.setResposibility(responsibility2);
        responsibility2.setResposibility(responsibility3);

        responsibility.go();
    }
}

package yingdg.exercise.designpattern.action.chainofresposibility;

/**
 * Created by YingDG on 2017/2/22.
 */
// 责任链模式
public class Resposibility extends AbsResposibility implements IResposibility {
    /*
    AbsResposibility本身具有IResposibility接口的引用，其继承类又实现了该接口
     */

    private String test;

    public Resposibility(String test) {
        this.test = test;
    }

    // 核心方法，类似于递归调用
    @Override
    public void go() {
        // 先执行自身方法
        System.out.println(test);

        // 再执行下一链节的方法
        IResposibility resposibility = super.getResposibility();
        if (resposibility != null) {
            resposibility.go();
        }
    }

    public static void main(String[] args) {
        Resposibility resposibility = new Resposibility("A");
        Resposibility resposibility2 = new Resposibility("B");
        Resposibility resposibility3 = new Resposibility("C");

        resposibility.setResposibility(resposibility2);
        resposibility2.setResposibility(resposibility3);

        resposibility.go();
    }
}

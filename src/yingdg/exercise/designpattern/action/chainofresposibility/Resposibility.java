package yingdg.exercise.designpattern.action.chainofresposibility;

/**
 * Created by YingDG on 2017/2/22.
 */
// 责任链模式
public class Resposibility extends AbsResposibility implements IResposibility {
    private String test;

    public Resposibility(String test) {
        this.test = test;
    }

    // 核心方法，类似于递归调用
    @Override
    public void go() {
        System.out.println(test);
        if (getResposibility() != null) {
            getResposibility().go();
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

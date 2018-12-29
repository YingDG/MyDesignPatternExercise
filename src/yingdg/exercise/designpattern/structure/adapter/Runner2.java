package yingdg.exercise.designpattern.structure.adapter;

/**
 * Created by YingDG on 2017/2/15.
 */
// 对象的适配器模式
public class Runner2 implements IAdapter {
    private Original original;

    public Runner2(Original original) {
        this.original = original;
    }

    @Override
    public void go() {
        original.go();
    }

    @Override
    public void go2() {
        System.out.println("Go2");
    }

    public static void main(String[] args) {
        Runner2 runner2 = new Runner2(new Original());
        runner2.go();

        runner2.go2();
    }
}

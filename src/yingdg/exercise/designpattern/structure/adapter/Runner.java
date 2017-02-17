package yingdg.exercise.designpattern.structure.adapter;

/**
 * Created by YingDG on 2017/2/15.
 */
// 类的适配器模式
public class Runner extends Original implements IAdapter {
    @Override
    public void go2() {
        System.out.println("Go2");
    }

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.go();
        runner.go2();
    }
}

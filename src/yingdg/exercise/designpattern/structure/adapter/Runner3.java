package yingdg.exercise.designpattern.structure.adapter;

/**
 * Created by YingDG on 2017/2/15.
 */
// 接口适配器模式（类似于模板方法模式）
public class Runner3 extends AbstractRunner {
    @Override
    public void go2() {
        System.out.println("Go2");
    }

    public static void main(String[] args) {
        IAdapter adapter = new Runner3();
        adapter.go2();
    }
}

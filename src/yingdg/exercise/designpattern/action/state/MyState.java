package yingdg.exercise.designpattern.action.state;

/**
 * Created by YingDG on 2017/2/22.
 */
// 实现类，本身包含不同壮态的实现
public class MyState {
    // 标识符
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void go1() {
        System.out.println("go1");
    }

    public void go2() {
        System.out.println("go2");
    }
}

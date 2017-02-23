package yingdg.exercise.designpattern.action.state;

/**
 * Created by YingDG on 2017/2/22.
 */
public class MyState {
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

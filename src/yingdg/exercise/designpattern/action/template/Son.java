package yingdg.exercise.designpattern.action.template;

/**
 * Created by YingDG on 2017/2/22.
 */
public class Son extends Father {
    @Override
    protected void go2() {
        System.out.println("Son.go2");
    }

    public static void main(String[] args) {
        Father f = new Son();
        f.go();
    }
}

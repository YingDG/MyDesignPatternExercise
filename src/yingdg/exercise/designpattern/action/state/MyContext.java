package yingdg.exercise.designpattern.action.state;

/**
 * Created by YingDG on 2017/2/22.
 */
public class MyContext {
    private MyState state;

    public MyContext(MyState state) {
        this.state = state;
    }

    public MyState getState() {
        return state;
    }

    public void setState(MyState state) {
        this.state = state;
    }

    public void go() {
        switch (state.getName()) {
            case "A":
                state.go1();
                break;
            case "B":
                state.go2();
                break;
            default:
                System.out.println("No!!!");
        }
    }

    public static void main(String[] args) {
        MyState state = new MyState();
        MyContext context = new MyContext(state);

        state.setName("A");
        context.go();

        state.setName("B");
        context.go();

        state.setName("");
        context.go();
    }
}

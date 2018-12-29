package yingdg.exercise.designpattern.action.visitor;

/**
 * @author YingDG
 * created in 2018/12/12 下午6:45
 */
public class Main {
    public static void main(String[] args) {
        IHandler handler = new MyHandler();

        // 针对不同的访问者，响应也不一样
        handler.receive(new MyVisit());
        handler.receive(new MyVisit2());
    }
}

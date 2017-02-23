package yingdg.exercise.designpattern.action.interpreter;

/**
 * Created by YingDG on 2017/2/23.
 */
// 解释器模式
public class Main {
    public static void main(String[] args) {
        ICalculation plus = new MathPlus();
        ICalculation minus = new MathMinus();
        int res = minus.cal(new MyNumber(plus.cal(new MyNumber(1, 5)), 2));
        System.out.println(res);
    }
}

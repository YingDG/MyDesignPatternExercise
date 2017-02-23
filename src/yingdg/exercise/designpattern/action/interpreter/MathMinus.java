package yingdg.exercise.designpattern.action.interpreter;

/**
 * Created by YingDG on 2017/2/23.
 */
public class MathMinus implements ICalculation {
    @Override
    public int cal(MyNumber number) {
        return number.getNum1() - number.getNum2();
    }
}

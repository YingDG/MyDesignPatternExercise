package yingdg.exercise.designpattern.action.interpreter;

/**
 * Created by YingDG on 2017/2/23.
 */
public class MyNumber {
    private int num1;
    private int num2;

    public MyNumber(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}

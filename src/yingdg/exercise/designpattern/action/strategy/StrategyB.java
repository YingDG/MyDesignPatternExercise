package yingdg.exercise.designpattern.action.strategy;

/**
 * Created by YingDG on 2017/2/22.
 */
public class StrategyB extends Strategy implements IStrategy {
    @Override
    public void go() {
        absGo();
        System.out.println("B.visit");
    }
}

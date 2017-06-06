package yingdg.exercise.designpattern.action.strategy;

/**
 * Created by YingDG on 2017/2/22.
 */
public class Main {

    /*
    统一接口不同实现的业务场景
     */
    public static void main(String[] args) {
        IStrategy strategy = new StrategyA();
        strategy.go();

        strategy = new StrategyB();
        strategy.go();
    }
}

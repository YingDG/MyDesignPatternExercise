package yingdg.exercise.designpattern.create.abstractfactory;

/**
 * Created by YingDG on 2017/2/15.
 */
public class FactoryAProvider implements AbstractFactory {
    @Override
    public IFactory getFactory() {
        return new FactoryA();
    }
}

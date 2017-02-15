package yingdg.exercise.designpattern.create.abstractfactory;

/**
 * Created by YingDG on 2017/2/15.
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new FactoryAProvider();
        IFactory factory = abstractFactory.getFactory();
        System.out.println(factory.go());
    }
}

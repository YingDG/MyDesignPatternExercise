package yingdg.exercise.designpattern.create.factory;

import com.sun.istack.internal.NotNull;

/**
 * Created by YingDG on 2017/2/15.
 */
// 静态工厂
public class Factory {
    private static IFactory factory;

    public static IFactory getFactory(@NotNull String type) {
        if ("A".equals(type)) {
            return new FactoryA();
        } else if ("B".equals(type)) {
            return new FactoryB();
        }

        return null;
    }

    public static void main(String[] args) {
        IFactory factory = Factory.getFactory("A");
        System.out.println(factory.go());

        factory = Factory.getFactory("B");
        System.out.println(factory.go());
    }
}

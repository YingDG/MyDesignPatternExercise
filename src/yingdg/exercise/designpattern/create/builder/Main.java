package yingdg.exercise.designpattern.create.builder;

/**
 * Created by YingDG on 2017/2/15.
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.getProductInstance(new ConcreteBuilder());
        System.out.println(product);
    }
}

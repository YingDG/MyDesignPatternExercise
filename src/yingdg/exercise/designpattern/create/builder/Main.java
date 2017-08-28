package yingdg.exercise.designpattern.create.builder;

/**
 * Created by YingDG on 2017/2/15.
 * 个人认为建造者模式是创建型设计模式中最为重要的模式，
 * 能够很好地在业务代码中实现解耦操作；
 * 缺点是业务模型需要高度的抽象一致性
 */
public class Main {

    /*
    实际编写业务代码时无形中使用较多
     */
    public static void main(String[] args) {
        Director director = new Director();

        IBuilder builder = new ProductBuilder();
        Product product = director.getProductInstance(builder);

        System.out.println(product);
    }
}

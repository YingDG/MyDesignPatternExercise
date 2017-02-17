package yingdg.exercise.designpattern.create.builder;

/**
 * Created by YingDG on 2017/2/15.
 */
public class ConcreteBuilder implements IBuilder {
    private Product product;

    public ConcreteBuilder() {
        product = new Product();
    }

    @Override
    public void buildName() {
        product.setProductName("Name");
    }

    @Override
    public void buildType() {
        product.setProductType("Type");
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}

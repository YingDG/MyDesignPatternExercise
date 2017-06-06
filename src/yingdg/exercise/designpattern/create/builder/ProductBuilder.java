package yingdg.exercise.designpattern.create.builder;

/**
 * Created by YingDG on 2017/2/15.
 * <p>
 * 一般会有多个builder实现类，以实现不同初始值的实例对象
 */
public class ProductBuilder implements IBuilder {
    private Product product;

    public ProductBuilder() {
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

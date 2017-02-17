package yingdg.exercise.designpattern.create.builder;

/**
 * Created by YingDG on 2017/2/15.
 */
public class Product {
    private String productName;
    private String productType;

    public Product() {
    }

    public Product(String productName, String productType) {
        this.productName = productName;
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                '}';
    }
}

package yingdg.exercise.designpattern.create.builder;

/**
 * Created by YingDG on 2017/2/15.
 */
public class Director {

    public Product getProductInstance(IBuilder builder) {
        builder.buildName();
        builder.buildType();
        return builder.buildProduct();
    }

}

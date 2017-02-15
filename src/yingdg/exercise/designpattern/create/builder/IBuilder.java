package yingdg.exercise.designpattern.create.builder;

/**
 * Created by YingDG on 2017/2/15.
 */
public interface IBuilder {
    void buildName();

    void buildType();

    Product buildProduct();
}

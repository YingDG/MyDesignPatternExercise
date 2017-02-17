package yingdg.exercise.designpattern.structure.facade;

/**
 * Created by YingDG on 2017/2/17.
 */
public class ClassB implements IFacade{

    @Override
    public void start() {
        System.out.println("B starts");
    }

    @Override
    public void end() {
        System.out.println("B ends");
    }
}

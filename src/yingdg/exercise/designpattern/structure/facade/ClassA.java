package yingdg.exercise.designpattern.structure.facade;

/**
 * Created by YingDG on 2017/2/17.
 */
public class ClassA implements IFacade {
    @Override
    public void start() {
        System.out.println("A starts");
    }

    @Override
    public void end() {
        System.out.println("A ends");
    }
}

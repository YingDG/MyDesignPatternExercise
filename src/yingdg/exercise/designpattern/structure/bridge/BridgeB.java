package yingdg.exercise.designpattern.structure.bridge;

/**
 * Created by YingDG on 2017/2/17.
 */
public class BridgeB implements IBridge {
    @Override
    public void go() {
        System.out.println("B");
    }
}

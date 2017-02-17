package yingdg.exercise.designpattern.structure.bridge;

/**
 * Created by YingDG on 2017/2/17.
 */
public class AbstractBridge {
    private IBridge bridge;

    public void go() {
        bridge.go();
    }

    public IBridge getBridge() {
        return bridge;
    }

    public void setBridge(IBridge bridge) {
        this.bridge = bridge;
    }
}

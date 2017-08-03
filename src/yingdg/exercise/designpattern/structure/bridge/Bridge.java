package yingdg.exercise.designpattern.structure.bridge;

/**
 * Created by YingDG on 2017/2/17.
 */
public class Bridge {
    private IBridge bridge;

    public void def() {
        bridge.go();
    }

    public IBridge getBridge() {
        return bridge;
    }

    public void setBridge(IBridge bridge) {
        this.bridge = bridge;
    }
}

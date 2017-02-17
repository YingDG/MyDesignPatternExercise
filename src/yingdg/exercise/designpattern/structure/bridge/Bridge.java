package yingdg.exercise.designpattern.structure.bridge;

/**
 * Created by YingDG on 2017/2/17.
 */
// 桥接模式
public class Bridge extends AbstractBridge {

    @Override
    public void go() {
        super.getBridge().go();
    }

    public static void main(String[] args) {
        Bridge bridge = new Bridge();

        bridge.setBridge(new BridgeA());
        bridge.go();

        bridge.setBridge(new BridgeB());
        bridge.go();
    }
}

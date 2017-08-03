package yingdg.exercise.designpattern.structure.bridge;

/**
 * Created by YingDG on 2017/2/17.
 */
// 桥接模式
public class SubBridge extends Bridge {
    /*
    这个类相当于重写了父类的实现
     */

    @Override
    public void def() {
        super.getBridge().go();
    }

    public static void main(String[] args) {
        SubBridge bridge = new SubBridge();

        bridge.setBridge(new BridgeA());
        bridge.def();

        bridge.setBridge(new BridgeB());
        bridge.def();
    }
}

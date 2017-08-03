package yingdg.exercise.designpattern.structure.proxy;

/**
 * Created by YingDG on 2017/2/17.
 */
// 静态代理
public class MyProxy {
    private HouseOwner owner;

    public MyProxy() {
        this.owner = new HouseOwner();
    }

    /*
    和状态模式的区别是被代理类本身只有一种功能实现，
    且需要标识符实现不同分支。
    状态模式的实现类本身具有功能的多种实现，且自带标识符
     */
    public void sellHouse(boolean needHelp) {
        if (needHelp) {
            System.out.println("中介卖房");
        } else {
            owner.sellHouse();
        }
    }

    public static void main(String[] args) {
        MyProxy proxy = new MyProxy();
        proxy.sellHouse(true);
        proxy.sellHouse(false);
    }
}

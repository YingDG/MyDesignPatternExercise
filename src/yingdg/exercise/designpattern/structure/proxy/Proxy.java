package yingdg.exercise.designpattern.structure.proxy;

/**
 * Created by YingDG on 2017/2/17.
 */
// 静态代理
public class Proxy {
    private HouseOwner owner;

    public Proxy() {
        this.owner = new HouseOwner();
    }

    public void sellHouse(boolean b) {
        if (b) {
            System.out.println("中介卖房");
        } else {
            owner.sellHouse();
        }
    }

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.sellHouse(true);
        proxy.sellHouse(false);
    }
}

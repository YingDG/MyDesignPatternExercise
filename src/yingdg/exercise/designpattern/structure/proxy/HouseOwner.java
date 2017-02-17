package yingdg.exercise.designpattern.structure.proxy;

/**
 * Created by YingDG on 2017/2/17.
 */
public class HouseOwner implements IProxy {
    @Override
    public void sellHouse() {
        System.out.println("房东卖房");
    }
}

package yingdg.exercise.designpattern.create.singleton;

import java.util.Objects;

/**
 * Created by YingDG on 2017/2/14.
 * <p>
 * 我个人称之为设计模式之首
 */
// 饿汉式单例类，在类初始化时，已经自行实例化，原生线程安全
public class SingletonEx2 {
    private static final SingletonEx2 singleton = new SingletonEx2();

    private SingletonEx2() {

    }

    public static SingletonEx2 getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        SingletonEx2 instance1 = SingletonEx2.getInstance();
        SingletonEx2 instance2 = SingletonEx2.getInstance();
        System.out.println(Objects.equals(instance1, instance2));
    }
}

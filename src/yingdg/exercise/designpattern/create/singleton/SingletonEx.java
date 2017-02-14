package yingdg.exercise.designpattern.create.singleton;

import java.util.Objects;

/**
 * Created by YingDG on 2017/2/14.
 * <p>
 * 我个人称之为设计模式之首
 */
// 懒汉式单例类，第一次调用时实例化自己，原生线程不安全
public class SingletonEx {
    private static SingletonEx singleton;

    private SingletonEx() {

    }

    // 线程安全的，同步锁定
    public static synchronized SingletonEx getInstance() {
        if (singleton == null) {
            singleton = new SingletonEx();
        }
        return singleton;
    }

    // 线程安全的，双重检查锁定
    public static SingletonEx getInstance2() {
        if (singleton == null) {
            synchronized (SingletonEx.class) {
                if (singleton == null) {
                    singleton = new SingletonEx();
                }
            }
        }
        return singleton;
    }

    private static class InnerClass {
        private static final SingletonEx SINGLETON = new SingletonEx();
    }

    // 线程安全的，静态内部类，性能佳
    public static synchronized SingletonEx getInstance3() {
        return InnerClass.SINGLETON;
    }

    public static void main(String[] args) {
        SingletonEx instance1 = SingletonEx.getInstance();
        SingletonEx instance2 = SingletonEx.getInstance();
        System.out.println(Objects.equals(instance1, instance2));

        SingletonEx instance3 = SingletonEx.getInstance3();
        SingletonEx instance4 = SingletonEx.getInstance3();
        System.out.println(Objects.equals(instance3, instance4));
    }

}

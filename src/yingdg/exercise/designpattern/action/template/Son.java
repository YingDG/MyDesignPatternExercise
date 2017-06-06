package yingdg.exercise.designpattern.action.template;

/**
 * Created by YingDG on 2017/2/22.
 */
public class Son extends Father {
    @Override
    protected void go2() {
        System.out.println("Son.go2");
    }

    /*
    业务代码中模板方法使用较多，
    多用在业务模型中某些具有相同特征但又有各自不同特性的部分，
    相同特征由共同的抽象父类实现，不同特性由对应不同的子类实现。
    最常用的做法是先由抽象父类实现统一接口，再由子类继承父类，以实现业务功能。
    Spring框架中可以通过对接口进行不同的注入类切换实现不同的业务功能。
     */
    public static void main(String[] args) {
        Father f = new Son();
        f.go();
    }
}

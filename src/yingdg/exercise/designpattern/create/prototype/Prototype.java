package yingdg.exercise.designpattern.create.prototype;

import java.util.Objects;

/**
 * Created by YingDG on 2017/2/15.
 */
// 原型模式
public class Prototype implements Cloneable {

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        Prototype clone = prototype.clone();
        System.out.println(Objects.equals(prototype, clone));
    }
}

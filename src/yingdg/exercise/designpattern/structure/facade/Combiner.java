package yingdg.exercise.designpattern.structure.facade;

/**
 * Created by YingDG on 2017/2/17.
 */
// 外观模式（常用的模式，毫无亮点）
public class Combiner implements IFacade {
    private ClassA a;
    private ClassB b;

    public Combiner() {
        this.a = new ClassA();
        this.b = new ClassB();
    }

    /*
    项目模块业务层开发常用的套路。
     */
    @Override
    public void start() {
        a.start();
        b.start();
    }

    @Override
    public void end() {
        a.end();
        b.end();
    }

    public static void main(String[] args) {
        Combiner combiner = new Combiner();
        combiner.start();
        combiner.end();
    }
}

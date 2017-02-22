package yingdg.exercise.designpattern.action.memento;

/**
 * Created by YingDG on 2017/2/22.
 */
// 备忘录类
public class Backup {
    private String name;

    public Backup(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package yingdg.exercise.designpattern.action.memento;

/**
 * Created by YingDG on 2017/2/22.
 */
// 要备份的源类
public class Bean {
    private String name;

    public Bean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Backup createBackup() {
        return new Backup(name);
    }

    public void resumeBackup(Backup backup) {
        this.name = backup.getName();
    }
}

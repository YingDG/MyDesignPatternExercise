package yingdg.exercise.designpattern.action.memento;

/**
 * Created by YingDG on 2017/2/22.
 */
// 储存类
public class Disk {
    private Backup backup;

    public Disk(Backup backup) {
        this.backup = backup;
    }

    public Backup getBackup() {
        return backup;
    }

    public void setBackup(Backup backup) {
        this.backup = backup;
    }
}

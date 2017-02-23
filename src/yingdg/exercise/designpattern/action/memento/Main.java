package yingdg.exercise.designpattern.action.memento;

/**
 * Created by YingDG on 2017/2/22.
 */
// 备忘录模式
public class Main {
    public static void main(String[] args) {
        Bean bean = new Bean("bean");
        Backup backup = bean.createBackup();
        Disk disk = new Disk(backup);

        bean.setName("bean2");
        System.out.println(bean.getName());

        bean.resumeBackup(disk.getBackup());
        System.out.println(bean.getName());
    }
}

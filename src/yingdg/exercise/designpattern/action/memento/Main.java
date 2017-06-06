package yingdg.exercise.designpattern.action.memento;

/**
 * Created by YingDG on 2017/2/22.
 */
// 备忘录模式
public class Main {

    /*
    如果不考虑单例、非单例对象的话，可以使用clone方式备份和还原
     */
    public static void main(String[] args) {
        // bean类本身具务备份、还原功能实现
        Bean bean = new Bean("bean");
        // 纯粹的javabean
        Backup backup = bean.createBackup();
        // 备份容器javabean，可扩展为存储单个不同的备份类
        Disk disk = new Disk(backup);

        bean.setName("bean2");
        System.out.println(bean.getName());

        bean.resumeBackup(disk.getBackup());
        System.out.println(bean.getName());
    }
}

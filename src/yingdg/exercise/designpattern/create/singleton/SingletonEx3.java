package yingdg.exercise.designpattern.create.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by YingDG on 2017/2/14.
 * <p>
 * 我个人称之为设计模式之首
 */
// 登记式单例类，将类名注册（Map），下次从里面直接获取，个人喜欢的做法
public class SingletonEx3 {
    private static Map<Class<?>, Object> map = new HashMap<>();

    private SingletonEx3() {

    }

    public static Object getInstance(Class<?> clz) {
        try {
            if (map.get(clz) == null) {
                Object o = Class.forName(clz.getName()).newInstance();
                map.put(clz, o);
            }
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        return map.get(clz);
    }
}

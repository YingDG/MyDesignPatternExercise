package yingdg.exercise.designpattern.create.singleton;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by YingDG on 2017/2/14.
 * <p>
 * 我个人称之为设计模式之首
 */
// 登记式单例类，将类名注册（Map），下次从里面直接获取，个人喜欢的做法
public class SingletonEx3 {
    private static Map<Class<?>, Object> map = new ConcurrentHashMap<>();

    private SingletonEx3() {

    }

    public synchronized static Object getInstance(Class<?> clz) {
        try {
            synchronized (SingletonEx3.class) {
                if (Objects.isNull(map.get(clz))) {
                    Object o = clz.newInstance();
                    map.put(clz, o);
                }
            }
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }

        return map.get(clz);
    }

    public static void main(String[] args) {
        Object o1 = SingletonEx3.getInstance(Object.class);
        Object o2 = SingletonEx3.getInstance(Object.class);
        System.out.println(Objects.equals(o1, o2));
    }
}

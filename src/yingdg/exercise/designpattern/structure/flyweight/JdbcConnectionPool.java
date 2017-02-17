package yingdg.exercise.designpattern.structure.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * Created by YingDG on 2017/2/17.
 */
// 享元模式
public class JdbcConnectionPool {
    private Vector<Connection> pool;

    /*公有属性*/
    private String url = "jdbc:mysql://localhost:3306/mytest";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";

    private int poolSize = 10;
    private static JdbcConnectionPool instance = null;
    private Connection conn = null;

    // 初始化连接池
    private JdbcConnectionPool() {
        pool = new Vector<Connection>(poolSize);
        try {
            for (int i = 0; i < poolSize; i++) {
                Class.forName(driverClassName);
                conn = DriverManager.getConnection(url, username, password);
                pool.add(conn);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    // 返回连接池中的一个数据库连接
    public synchronized Connection getConnection() {
        if (pool.size() > 0) {
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        } else {
            return null;
        }
    }

    // 返回连接到连接池
    public synchronized void release() {
        pool.add(conn);
    }

}

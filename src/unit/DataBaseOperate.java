package unit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseOperate {
    Connection conn = null;
    public Connection getCon(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("成功加载驱动");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","kyrie123");
            System.out.println("成功连接到数据库");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void addUser(String username,String password){
        try {
            PreparedStatement prst = conn.prepareStatement("insert into users(USERNAME,PASSWORD) values (?,?)");
            prst.setString(1,username);
            prst.setString(2,password);
            prst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("未成功添加");
        }

    }
}

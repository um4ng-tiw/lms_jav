/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umang
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
    Connection conn;
    public static Connection ConnecrDb()
    {
        try{
            Class.forName("org.sqlite.JDBC").newInstance();
            String url=System.getProperty("user.dir");
            url=url.replace("\\", "/");
            url=url+"/src/Lib.sqlite";
            Connection conn=DriverManager.getConnection("jdbc:sqlite:"+url);
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            System.out.println("Error here");
            return null;
        }
    }
    
    
}

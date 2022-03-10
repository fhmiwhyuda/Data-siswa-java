/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasiswa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author FAHMI
 */
public class koneksi {
    private static Connection mysqlkonek;
    public static Connection koneksiDB() throws SQLException {
        if (mysqlkonek==null){
            try {
                String DB="jdbc:mysql://localhost:3306/db_datasiswa";
                String user="root";
                String pass="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkonek=(Connection) DriverManager.getConnection(DB,user,pass);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "koneksi gagal");
            }
        } return mysqlkonek;
    }
}

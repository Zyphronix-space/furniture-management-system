/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package furniture.management.system;

/**
 *
 * @author ASUS
 */
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class JDBC {
    public static void main(String[] args) {
        connectdb();
    }
         public static Connection connectdb(){
     try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbUser = System.getenv().getOrDefault("DB_USER", "root");
            String dbPassword = System.getenv().getOrDefault("DB_PASSWORD", "");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fms?useSSL=false&serverTimezone=UTC", dbUser, dbPassword);

        System.out.println("Sucess");
        
            return conn;
            
     }catch(HeadlessException | ClassNotFoundException | SQLException e){
         JOptionPane.showMessageDialog(null, e);
         return null;
     }
    }

   
}

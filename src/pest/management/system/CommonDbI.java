/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pest.management.system;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author panka
 */
public class CommonDbI {
     static Connection con;
    static String url ="jdbc:mysql://localhost:3306/image";
    static String user= "root";
    static String pass ="";
   
    public static Connection getConnectionI(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("connected.");
            
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return con;
    }
    public static void main(String args[])
    {
        getConnectionI();
    }
    
}

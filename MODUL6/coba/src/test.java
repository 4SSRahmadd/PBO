
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WINDOWS 10
 */

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class test {
    
    public static void main(String[] args) {
        
        test test = new test();
        test.test();
    }
    
    public static void test(){
        
        String className = "com.mysql.cj.jdbc.Driver";
        String urlDB = "jdbc:mysql://localhost:3306/modul6";
        String user = "root";
        String password = "";
        Statement statement;
        try {
            Class.forName(className);
//            Connection koneksi = DriverManager.getConnection(urlDB, user, password);
            Connection konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/modul6?user=root&password= ");

            System.out.println("Berhasil konek");
//            return statement = koneksi.createStatement();
        } catch (Exception e) {
            System.out.println("gagal konek");
//            return statement = null;
//            e.printStackTrace();
        }
//        return statement = null;
    }

}    

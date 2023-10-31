/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba;

/**
 *
 * @author WINDOWS 10
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class coba2 {
    private static final String className = "com.mysql.cj.jdbc.Driver";
    private static final String urlDB = "jdbc:mysql://localhost:3306/modul6";
    private static final String user = "root";
    private static final String password = "";
    
    public static void main(String[] args) {
        Statement statement;
        try {
            Class.forName(className);
            Connection koneksi = DriverManager.getConnection(urlDB, user, password);
            statement = koneksi.createStatement();
            System.out.println("Berhasil konek");
        } catch (Exception e) {
            System.out.println("gagal konek");
            e.printStackTrace();
        }
    }

}    

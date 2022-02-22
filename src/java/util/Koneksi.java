/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {
    private String dbDriver = "com.mysql.jdbc.Driver";
    private String dbUsername = "root";
    private String dbPassword = "";
    private String dbURL = "jdbc:mysql://localhost:3306/bejilor?zeroDateTimeBehavior=convertToNull";

    private Connection kon;

    public Koneksi(){
        try {
            Class.forName(dbDriver);
            kon = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        } catch (Exception e) {
            kon = null;
        }
    }
    
    public Connection getKon(){
        return kon;
    }
}

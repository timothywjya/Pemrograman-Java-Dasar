/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Login;
import util.Koneksi;

public class LoginDao {
    public List<Login> getAll(){
        Koneksi kon = new Koneksi();
        if(kon.getKon() == null){
            return null;
        }else{
            Statement stmt = null;
            ResultSet rs = null;
            List<Login> listLogin = null;
            try {  
                stmt = kon.getKon().createStatement();
                rs = stmt.executeQuery("SELECT username, password, jenis, nama, no_ktp FROM login");
                listLogin = new ArrayList<>();
                while(rs.next()){
                    Login dataLogin = new Login();
                    dataLogin.setUsername(rs.getString("username"));
                    dataLogin.setPassword(rs.getString("password"));
                    dataLogin.setJenis(rs.getString("jenis"));
                    dataLogin.setNama(rs.getString("nama"));
                    dataLogin.setNo_ktp(rs.getString("no_ktp"));
                    
                    listLogin.add(dataLogin);
                }
                rs.close();
                stmt.close();
                kon.getKon().close();
            } catch (SQLException ex) {    
            }
            return listLogin;
        }
    }
    
public boolean delete(String usernameLogin){
        Koneksi kon = new Koneksi();
        if(kon.getKon() == null){
            return false;
        }else{
            Statement stmt = null;
            try {
                stmt = kon.getKon().createStatement();
                int terhapus = stmt.executeUpdate("DELETE FROM login WHERE username = '"+usernameLogin+"'");                
                stmt.close();
                kon.getKon().close();
                if(terhapus>0){
                    return true;
                }else{
                    return false;
                }
            } catch (SQLException ex) {
                return false;
            }
        }
    }

     
  
}

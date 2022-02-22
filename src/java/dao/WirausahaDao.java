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
import model.Wirausaha;
import util.Koneksi;

public class WirausahaDao {
    public List<Wirausaha> getAll(){
        Koneksi kon = new Koneksi();
        if(kon.getKon() == null){
            return null;
        }else{
            Statement stmt = null;
            ResultSet rs = null;
            List<Wirausaha> listWirausaha = null;
            try {  
                stmt = kon.getKon().createStatement();
                rs = stmt.executeQuery("SELECT id, nama_usaha, pemilik, alamat, deskripsi FROM wirausaha");
                listWirausaha = new ArrayList<>();
                while(rs.next()){
                    Wirausaha dataWirausaha = new Wirausaha();
                    dataWirausaha.setId(rs.getString("id"));
                    dataWirausaha.setNama_usaha(rs.getString("nama_usaha"));
                    dataWirausaha.setPemilik(rs.getString("pemilik"));
                    dataWirausaha.setAlamat(rs.getString("alamat"));
                    dataWirausaha.setDeskripsi(rs.getString("deskripsi"));
                  
                    
                    listWirausaha.add(dataWirausaha);
                }
                rs.close();
                stmt.close();
                kon.getKon().close();
            } catch (SQLException ex) {    
            }
            return listWirausaha;
        }
    }
    
public boolean delete(String idWirausaha){
        Koneksi kon = new Koneksi();
        if(kon.getKon() == null){
            return false;
        }else{
            Statement stmt = null;
            try {
                stmt = kon.getKon().createStatement();
                int terhapus = stmt.executeUpdate("DELETE FROM wirausaha WHERE id = '"+idWirausaha+"'");                
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

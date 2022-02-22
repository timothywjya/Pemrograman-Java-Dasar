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
import model.Wisata;
import util.Koneksi;

public class WisataDao {
    public List<Wisata> getAll(){
        Koneksi kon = new Koneksi();
        if(kon.getKon() == null){
            return null;
        }else{
            Statement stmt = null;
            ResultSet rs = null;
            List<Wisata> listWisata = null;
            try {  
                stmt = kon.getKon().createStatement();
                rs = stmt.executeQuery("SELECT id, nama, deskripsi FROM wisata");
                listWisata = new ArrayList<>();
                while(rs.next()){
                    Wisata dataWisata = new Wisata();
                    dataWisata.setId(rs.getString("id"));
                    dataWisata.setNama(rs.getString("nama"));
                    dataWisata.setDeskripsi(rs.getString("deskripsi"));
                    
                    listWisata.add(dataWisata);
                }
                rs.close();
                stmt.close();
                kon.getKon().close();
            } catch (SQLException ex) {    
            }
            return listWisata;
        }
    }
    
public boolean delete(String idWisata){
        Koneksi kon = new Koneksi();
        if(kon.getKon() == null){
            return false;
        }else{
            Statement stmt = null;
            try {
                stmt = kon.getKon().createStatement();
                int terhapus = stmt.executeUpdate("DELETE FROM wisata WHERE id = '"+idWisata+"'");                
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

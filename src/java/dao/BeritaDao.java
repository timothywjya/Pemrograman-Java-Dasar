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
import model.Berita;
import util.Koneksi;

public class BeritaDao {
    public List<Berita> getAll(){
        Koneksi kon = new Koneksi();
        if(kon.getKon() == null){
            return null;
        }else{
            Statement stmt = null;
            ResultSet rs = null;
            List<Berita> listBerita = null;
            try {  
                stmt = kon.getKon().createStatement();
                rs = stmt.executeQuery("SELECT id, judul, tanggal, isi, editor FROM berita");
                listBerita = new ArrayList<>();
                while(rs.next()){
                    Berita dataBerita = new Berita();
                    dataBerita.setId(rs.getString("id"));
                    dataBerita.setJudul(rs.getString("judul"));
                    dataBerita.setTanggal(rs.getString("tanggal"));
                    dataBerita.setIsi(rs.getString("isi"));
                    dataBerita.setEditor(rs.getString("editor"));
                    
                    listBerita.add(dataBerita);
                }
                rs.close();
                stmt.close();
                kon.getKon().close();
            } catch (SQLException ex) {    
            }
            return listBerita;
        }
    }
    
public boolean delete(String idBerita){
        Koneksi kon = new Koneksi();
        if(kon.getKon() == null){
            return false;
        }else{
            Statement stmt = null;
            try {
                stmt = kon.getKon().createStatement();
                int terhapus = stmt.executeUpdate("DELETE FROM berita WHERE id = '"+idBerita+"'");                
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

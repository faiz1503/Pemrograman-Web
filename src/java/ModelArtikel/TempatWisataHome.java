/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelArtikel;

import Koneksi.Koneksi;
import Model.Oleh2;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DeysiFortuna
 */
public class TempatWisataHome {
    public TempatWisata[] getDaftarTempatWisata(){
        TempatWisata[] daftarTempatWisata = null;
        TempatWisata tempTempatWisata = null;
        ArrayList listTempatWisata = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from tempatwisata";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempTempatWisata = new TempatWisata();
                tempTempatWisata.setKodeTempatWisata(rs.getString("kodeTempatWisata"));
                tempTempatWisata.setJudul(rs.getString("judul"));
                tempTempatWisata.setGambar(rs.getString("gambar"));
                tempTempatWisata.setIsi(rs.getString("harga"));
                tempTempatWisata.setKategori(rs.getString("kategori"));
                listTempatWisata.add(tempTempatWisata);
            }
            daftarTempatWisata = new TempatWisata[listTempatWisata.size()];
            listTempatWisata.toArray(daftarTempatWisata);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return daftarTempatWisata;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
    public TempatWisata getDaftarTempatWisataByKode(String kodeTempatWisata){
        TempatWisata tempatWisata = null;

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from tempatWisata";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempatWisata = new TempatWisata();
                tempatWisata.setKodeTempatWisata(rs.getString("kodeTempatWisata"));
                tempatWisata.setJudul(rs.getString("judul"));
                tempatWisata.setGambar(rs.getString("gambar"));
                tempatWisata.setIsi(rs.getString("harga"));
                tempatWisata.setKategori(rs.getString("kategori"));
            };
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return tempatWisata;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        
    }
    
    public boolean create(TempatWisata dataTempatWisata) {
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        try {
            String insert = "insert into tempatWisata values("
                    + "'"+dataTempatWisata.getKodeTempatWisata()+"',"
                    + "'"+dataTempatWisata.getJudul()+"',"
                    + "'"+dataTempatWisata.getGambar()+"',"
                    + "'"+dataTempatWisata.getIsi()+"',"
                    + "'"+dataTempatWisata.getKategori()+"')";
            akses.connect();
            akses.executeUpdate(insert);
            akses.disconnect();
            return true;
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            return false;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean store(TempatWisata dataTempatWisata){
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        boolean sukses = false;
        
        try {           
            String insert ="UPDATE tempatWisata SET judul='"+dataTempatWisata.getJudul()+"',"
                    +"gambar='"+dataTempatWisata.getGambar()+"',"
                    +"isi='"+dataTempatWisata.getIsi()+"',"
                    +"kategori='"+dataTempatWisata.getKategori()+"' WHERE kodeTempatWisata='"+dataTempatWisata.getKodeTempatWisata()+"';";
            akses.connect();
            
            int baris = akses.executeUpdate(insert);
            if(baris > 0) sukses=true;
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                akses.disconnect();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return sukses;
    }
    
    public boolean delete(String kodeTempatWisata){
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        boolean sukses = false;
        
        try{
            String insert = "delete from tempatWisata where kodeTempatWisata='"+kodeTempatWisata+"'";
            akses.connect();
            
            int baris = akses.executeUpdate(insert);
            if(baris > 0) sukses=true;
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                akses.disconnect();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return sukses;
    }
}

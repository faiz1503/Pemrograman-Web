/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Koneksi.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DeysiFortuna
 */
public class ArtikelHome {
    public Artikel[] getDaftarArtikel(){
        Artikel[] daftarArtikel = null;
        Artikel tempArtikel = null;
        ArrayList listArtikel = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from artikel";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempArtikel = new Artikel();
                tempArtikel.setKodeArtikel(rs.getString("kodeArtikel"));
                tempArtikel.setJudul(rs.getString("judul"));
                tempArtikel.setIsiArtikel(rs.getString("isiArtikel"));
                tempArtikel.setKategori(rs.getString("kategori"));
                listArtikel.add(tempArtikel);
            }
            daftarArtikel = new Artikel[listArtikel.size()];
            listArtikel.toArray(daftarArtikel);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return daftarArtikel;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        
    }
    
    public Artikel getDaftarArtikelByKode(String kodeArtikel) {
        Artikel artikel = null;

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from artikel where kodeArtikel='"+kodeArtikel+"'";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                artikel = new Artikel();
                artikel.setJudul(rs.getString("judul"));
                artikel.setIsiArtikel(rs.getString("isiArtikel"));
                artikel.setKategori(rs.getString("kategori"));
            };
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return artikel;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }

    }
    
    public boolean create(Artikel dataArtikel) {
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        try {
            String insert = "insert into artikel values("
                    + "'"+dataArtikel.getKodeArtikel()+"',"
                    + "'"+dataArtikel.getJudul()+"',"
                    + "'"+dataArtikel.getIsiArtikel()+"',"
                    + "'"+dataArtikel.getKategori()+"')";
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

    public boolean store(Artikel dataArtikel){
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        boolean sukses = false;
        
        try{
            String insert ="UPDATE artikel SET judul='"+dataArtikel.getJudul()+"',"
                    +"isiArtikel='"+dataArtikel.getIsiArtikel()+"',"
                    +"kategori='"+dataArtikel.getKategori()+"' WHERE kodeMember='"+dataArtikel.getKodeArtikel()+"';";
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
    
    public boolean delete(String kodeArtikel){
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        boolean sukses = false;
        
        try{
            String insert = "delete from artikel where kodeArtikel='"+kodeArtikel+"'";
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
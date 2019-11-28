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
public class ArtikelHome {
    public Artikel[] getDaftarArtikel(){
        Artikel[] daftarTempatWisata = null;
        Artikel tempTempatWisata = null;
        ArrayList listTempatWisata = new ArrayList();

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
                tempTempatWisata = new Artikel();
                tempTempatWisata.setKodeArtikel(rs.getString("kodeArtikel"));
                tempTempatWisata.setJudul(rs.getString("judul"));
                tempTempatWisata.setGambar(rs.getString("gambar"));
                tempTempatWisata.setKategori(rs.getString("kategori"));
                tempTempatWisata.setIsi(rs.getString("isi"));
                tempTempatWisata.setJenis(rs.getString("jenis"));
                listTempatWisata.add(tempTempatWisata);
            }
            daftarTempatWisata = new Artikel[listTempatWisata.size()];
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
    public Artikel[] getDaftarArtikel(String jenis){
        Artikel[] daftarTempatWisata = null;
        Artikel tempTempatWisata = null;
        ArrayList listTempatWisata = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from artikel where jenis='"+jenis+"'";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempTempatWisata = new Artikel();
                tempTempatWisata.setKodeArtikel(rs.getString("kodeArtikel"));
                tempTempatWisata.setJudul(rs.getString("judul"));
                tempTempatWisata.setGambar(rs.getString("gambar"));
                tempTempatWisata.setKategori(rs.getString("kategori"));
                tempTempatWisata.setIsi(rs.getString("isi"));
                tempTempatWisata.setJenis(rs.getString("jenis"));
                listTempatWisata.add(tempTempatWisata);
            }
            daftarTempatWisata = new Artikel[listTempatWisata.size()];
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
    public Artikel[] getDaftarProvinsi(){
        Artikel[] daftarTempatWisata = null;
        Artikel tempTempatWisata = null;
        ArrayList listTempatWisata = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from provinsi";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempTempatWisata = new Artikel();
                tempTempatWisata.setProvinsi(rs.getString("namaProvinsi"));
                listTempatWisata.add(tempTempatWisata);
            }
            daftarTempatWisata = new Artikel[listTempatWisata.size()];
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
    public Artikel[] getDaftarJenis(){
        Artikel[] daftarTempatWisata = null;
        Artikel tempTempatWisata = null;
        ArrayList listTempatWisata = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from jenisArtikel";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempTempatWisata = new Artikel();
                tempTempatWisata.setJenis2(rs.getString("jenis"));
                listTempatWisata.add(tempTempatWisata);
            }
            daftarTempatWisata = new Artikel[listTempatWisata.size()];
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
    public Artikel getDaftarArtikelByKode(String kodeTempatWisata){
        Artikel tempatWisata = null;

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
                tempatWisata = new Artikel();
                tempatWisata.setKodeArtikel(rs.getString("kodeArtikel"));
                tempatWisata.setJudul(rs.getString("judul"));
                tempatWisata.setGambar(rs.getString("gambar"));
                tempatWisata.setKategori(rs.getString("kategori"));
                tempatWisata.setIsi(rs.getString("isi"));
                tempatWisata.setJenis(rs.getString("jenis"));
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
    
    public boolean create(Artikel dataTempatWisata) {
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        try {
            String insert = "insert into artikel values("
                    + "'"+dataTempatWisata.getKodeArtikel()+"',"
                    + "'"+dataTempatWisata.getJudul()+"',"
                    + "'"+dataTempatWisata.getGambar()+"',"
                    + "'"+dataTempatWisata.getKategori()+"',"
                    + "'"+dataTempatWisata.getIsi()+"',"
                    + "'"+dataTempatWisata.getJenis()+"')";
            String nomor = "insert into noartikel select count(*)+1 from noartikel";
            akses.connect();
            akses.executeUpdate(insert);
            akses.executeUpdate(nomor);
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
        
        try {           
            String insert ="UPDATE artikel SET judul='"+dataArtikel.getJudul()+"',"
                    +"gambar='"+dataArtikel.getGambar()+"',"
                    +"kategori='"+dataArtikel.getKategori()+"',"
                    +"isi='"+dataArtikel.getIsi()+"',"
                    +"jenis='"+dataArtikel.getJenis()+"' WHERE kodeArtikel='"+dataArtikel.getKodeArtikel()+"';";
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

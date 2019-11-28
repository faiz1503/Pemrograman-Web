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
public class KomentarHome {
    public Komentar[] getDaftarKomentar(){
        Komentar[] daftarKomentar = null;
        Komentar tempKomentar = null;
        ArrayList listKomentar = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from komentar";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempKomentar = new Komentar();
                tempKomentar.setKodeKomentar(rs.getString("kodeKomentar"));
                tempKomentar.setKodeMember(rs.getString("kodeMember"));
                tempKomentar.setKodeArtikel(rs.getString("kodeArtikel"));
                tempKomentar.setTgl(rs.getString("tgl"));
                tempKomentar.setIsiKomentar(rs.getString("isiKomentar"));
                listKomentar.add(tempKomentar);
            }
            daftarKomentar = new Komentar[listKomentar.size()];
            listKomentar.toArray(daftarKomentar);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return daftarKomentar;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        
    }
    
    public boolean create(Komentar dataKomentar) {
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        try {
            String insert = "insert into komentar values("
                    + "'"+dataKomentar.getKodeKomentar()+"',"
                    + "'"+dataKomentar.getKodeMember()+"',"
                    + "'"+dataKomentar.getKodeArtikel()+"',"
                    + "'"+dataKomentar.getIsiKomentar()+"',"
                    + "'"+dataKomentar.getTgl()+"')";
            String nomor = "insert into nokomentar select count(*)+1 from nokomentar";
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

    public boolean store(Komentar dataKomentar){
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        boolean sukses = false;
        
        try {           
            String insert ="UPDATE komentar SET kodeMember='"+dataKomentar.getKodeMember()+"',"
                    +"kodeArtikel='"+dataKomentar.getKodeArtikel()+"',"
                    +"tgl='"+dataKomentar.getTgl()+"',"
                    +"isiKomentar='"+dataKomentar.getIsiKomentar()+"' WHERE kodeKomentar='"+dataKomentar.getKodeKomentar()+"';";
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
    
    public boolean delete(String kodeKomentar){
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        boolean sukses = false;
        
        try{
            String insert = "delete from komentar where kodeKomentar='"+kodeKomentar+"'";
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

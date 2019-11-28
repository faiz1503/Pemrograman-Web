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
public class Oleh2Home {
    public Oleh2[] getDaftarOleh2(){
        Oleh2[] daftarOleh2 = null;
        Oleh2 tempOleh2 = null;
        ArrayList listOleh2 = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from oleh2";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempOleh2 = new Oleh2();
                tempOleh2.setKodeOleh2(rs.getString("kodeOleh2"));
                tempOleh2.setKodePusatOleh2(rs.getString("kodePusatOleh2"));
                tempOleh2.setNama(rs.getString("nama"));
                tempOleh2.setHarga(Integer.parseInt(rs.getString("harga")));
                tempOleh2.setGambar(rs.getString("gambar"));
                listOleh2.add(tempOleh2);
            }
            daftarOleh2 = new Oleh2[listOleh2.size()];
            listOleh2.toArray(daftarOleh2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return daftarOleh2;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
    public Oleh2[] getDaftarOleh2bykode(String kodePusatOleh2){
        Oleh2[] daftarOleh2 = null;
        Oleh2 tempOleh2 = null;
        ArrayList listOleh2 = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from oleh2 where kodePusatOleh2='"+kodePusatOleh2+"'";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempOleh2 = new Oleh2();
                tempOleh2.setKodeOleh2(rs.getString("kodeOleh2"));
                tempOleh2.setKodePusatOleh2(rs.getString("kodePusatOleh2"));
                tempOleh2.setNama(rs.getString("nama"));
                tempOleh2.setHarga(Integer.parseInt(rs.getString("harga")));
                tempOleh2.setGambar(rs.getString("gambar"));
                listOleh2.add(tempOleh2);
            }
            daftarOleh2 = new Oleh2[listOleh2.size()];
            listOleh2.toArray(daftarOleh2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return daftarOleh2;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
    public Oleh2 getDaftarOleh2ByKode(String kodeOleh2){
        Oleh2 oleh2 = null;

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from oleh2";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                oleh2 = new Oleh2();
                oleh2.setKodeOleh2(rs.getString("kodeOleh2"));
                oleh2.setKodePusatOleh2(rs.getString("kodePusatOleh2"));
                oleh2.setNama(rs.getString("nama"));
                oleh2.setHarga(Integer.parseInt(rs.getString("harga")));
                oleh2.setGambar(rs.getString("gambar"));
            };
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return oleh2;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        
    }
    
    public boolean create(Oleh2 dataOleh2) {
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        try {
            String insert = "insert into oleh2 values("
                    + "'"+dataOleh2.getKodeOleh2()+"',"
                    + "'"+dataOleh2.getKodePusatOleh2()+"',"
                    + "'"+dataOleh2.getNama()+"',"
                    + "'"+dataOleh2.getHarga()+"',"
                    + "'"+dataOleh2.getGambar()+"')";
            
            String nomor = "insert into nooleh2 select count(*)+1 from nooleh2";
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

    public boolean store(Oleh2 dataOleh2){
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        boolean sukses = false;
        
        try {           
            String insert ="UPDATE oleh2 SET kodePusatOleh2='"+dataOleh2.getKodePusatOleh2()+"',"
                    +"nama='"+dataOleh2.getNama()+"',"
                    +"harga='"+dataOleh2.getHarga()+"',"
                    +"gambar='"+dataOleh2.getGambar()+"' WHERE kodeOleh2='"+dataOleh2.getKodeOleh2()+"';";
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
    
    public boolean delete(String kodeOleh2){
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        boolean sukses = false;
        
        try{
            String insert = "delete from oleh2 where kodeOleh2='"+kodeOleh2+"'";
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

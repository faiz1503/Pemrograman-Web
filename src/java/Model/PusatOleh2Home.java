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
public class PusatOleh2Home {
    public PusatOleh2[] getDaftarPusatOleh2(){
        PusatOleh2[] daftarPusatOleh2 = null;
        PusatOleh2 tempPusatOleh2 = null;
        ArrayList listPusatOleh2 = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from pusatoleh2";
        int count=0;

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempPusatOleh2 = new PusatOleh2();
                tempPusatOleh2.setKodePusatOleh2(rs.getString("kodePusatOleh2"));
                tempPusatOleh2.setNama(rs.getString("nama"));
                tempPusatOleh2.setAlamat(rs.getString("alamat"));
                tempPusatOleh2.setKota(rs.getString("kota"));
                tempPusatOleh2.setProvinsi(rs.getString("provinsi"));
                tempPusatOleh2.setNoHPToko(rs.getString("noHPToko"));
                tempPusatOleh2.setGambar(rs.getString("gambar"));
                listPusatOleh2.add(tempPusatOleh2);
                count++;
            }
            PusatOleh2.setCount(count);
            daftarPusatOleh2 = new PusatOleh2[listPusatOleh2.size()];
            listPusatOleh2.toArray(daftarPusatOleh2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return daftarPusatOleh2;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
    public PusatOleh2[] getLastDaftarPusatOleh2(){
        PusatOleh2[] daftarPusatOleh2 = null;
        PusatOleh2 tempPusatOleh2 = null;
        ArrayList listPusatOleh2 = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from pusatoleh2 order by kodePusatOleh2 desc";
        int count=0;

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempPusatOleh2 = new PusatOleh2();
                tempPusatOleh2.setKodePusatOleh2(rs.getString("kodePusatOleh2"));
                tempPusatOleh2.setNama(rs.getString("nama"));
                tempPusatOleh2.setAlamat(rs.getString("alamat"));
                tempPusatOleh2.setKota(rs.getString("kota"));
                tempPusatOleh2.setProvinsi(rs.getString("provinsi"));
                tempPusatOleh2.setNoHPToko(rs.getString("noHPToko"));
                tempPusatOleh2.setGambar(rs.getString("gambar"));
                listPusatOleh2.add(tempPusatOleh2);
                count++;
            }
            PusatOleh2.setCount(count);
            daftarPusatOleh2 = new PusatOleh2[listPusatOleh2.size()];
            listPusatOleh2.toArray(daftarPusatOleh2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return daftarPusatOleh2;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
    public PusatOleh2 getDaftarPusatOleh2ByKode(String kodePusatOleh2){
        PusatOleh2 pusatOleh2=null;

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from pusatoleh2 where kodePusatOleh2='"+kodePusatOleh2+"'";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                pusatOleh2 = new PusatOleh2();
                pusatOleh2.setKodePusatOleh2(rs.getString("kodePusatOleh2"));
                pusatOleh2.setNama(rs.getString("nama"));
                pusatOleh2.setAlamat(rs.getString("alamat"));
                pusatOleh2.setKota(rs.getString("kota"));
                pusatOleh2.setProvinsi(rs.getString("provinsi"));
                pusatOleh2.setNoHPToko(rs.getString("noHPToko"));
                pusatOleh2.setGambar(rs.getString("gambar"));
            };
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return pusatOleh2;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
    
    public boolean create(PusatOleh2 dataPusatOleh2) {
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        try {
            String insert = "insert into pusatoleh2 values("
                    + "'"+dataPusatOleh2.getKodePusatOleh2()+"',"
                    + "'"+dataPusatOleh2.getNama()+"',"
                    + "'"+dataPusatOleh2.getAlamat()+"',"
                    + "'"+dataPusatOleh2.getKota()+"',"
                    + "'"+dataPusatOleh2.getProvinsi()+"',"
                    + "'"+dataPusatOleh2.getNoHPToko()+"',"
                    + "'"+dataPusatOleh2.getGambar()+"')";
            String nomor = "insert into nopusatoleh2 select count(*)+1 from nopusatoleh2";
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

    public boolean store(PusatOleh2 dataPusatOleh2){
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        boolean sukses = false;
        
        try {           
            String insert ="UPDATE pusatoleh2 SET nama='"+dataPusatOleh2.getNama()+"',"
                    +"alamat='"+dataPusatOleh2.getAlamat()+"',"
                    +"kota='"+dataPusatOleh2.getKota()+"',"
                    +"gambar='"+dataPusatOleh2.getGambar()+"',"
                    +"noHPToko='"+dataPusatOleh2.getNoHPToko()+"',"
                    +"provinsi='"+dataPusatOleh2.getProvinsi()+"' WHERE kodePusatOleh2='"+dataPusatOleh2.getKodePusatOleh2()+"';";
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
    
    public boolean delete(String kodePusatOleh2){
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        boolean sukses = false;
        
        try{
            String insert = "delete from pusatoleh2 where kodePusatOleh2='"+kodePusatOleh2+"'";
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

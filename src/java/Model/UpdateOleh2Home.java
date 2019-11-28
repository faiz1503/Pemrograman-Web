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
public class UpdateOleh2Home {
    
    public UpdateOleh2[] getUpdateOleh2(){
        UpdateOleh2[] daftarUpdate = null;
        UpdateOleh2 tempUpdate = null;
        ArrayList listUpdate = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from updateoleh2";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempUpdate = new UpdateOleh2();
                tempUpdate.setKodeUpdate(rs.getString("kodeUpdate"));
                tempUpdate.setKodeAdminToko(rs.getString("kodeAdminToko"));
                tempUpdate.setKodeOleh2(rs.getString("kodeOleh2"));
                tempUpdate.setTglUpdate(rs.getString("tglUpdate"));
                tempUpdate.setKet(rs.getString("ket"));
                listUpdate.add(tempUpdate);
            }
            daftarUpdate = new UpdateOleh2[listUpdate.size()];
            listUpdate.toArray(daftarUpdate);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return daftarUpdate;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        
    }
    
    public boolean create(UpdateOleh2 dataArtikel) {
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        try {
            String insert = "insert into updateoleh2 values("
                    + "'"+dataArtikel.getKodeUpdate()+"',"
                    + "'"+dataArtikel.getKodeOleh2()+"',"
                    + "'"+dataArtikel.getKodeAdminToko()+"',"
                    + "'"+dataArtikel.getTglUpdate()+"',"
                    + "'"+dataArtikel.getKet()+"')";
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

    public boolean store(UpdateOleh2 dataUpdate){
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        boolean sukses = false;
        
        try{
            String insert ="UPDATE updateoleh2 SET kodeOleh2='"+dataUpdate.getKodeOleh2()+"',"
                    +"kodeAdminToko='"+dataUpdate.getKodeAdminToko()+"',"
                    +"tglUpdate='"+dataUpdate.getTglUpdate()+"',"
                    +"ket='"+dataUpdate.getKet()+"' WHERE kodeUpdate='"+dataUpdate.getKodeUpdate()+"';";
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
    
    public boolean delete(String kodeUpdate){
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        boolean sukses = false;
        
        try{
            String insert = "delete from updatepembelian where kodeUpdate='"+kodeUpdate+"'";
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

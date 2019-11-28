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
public class TransaksiPembelianHome {
    public TransaksiPembelian[] getDaftarTransaksiPembelian(){
        TransaksiPembelian[] daftarTransaksi = null;
        TransaksiPembelian tempTransaksi = null;
        ArrayList listTransaksi = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from transaksipembelian";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempTransaksi = new TransaksiPembelian();
                tempTransaksi.setKodeTransaksi(rs.getString("kodeTransaksi"));
                tempTransaksi.setKodeMember(rs.getString("kodeMember"));
                tempTransaksi.setKodeOleh2(rs.getString("kodeOleh2"));
                tempTransaksi.setJmlBeli(Integer.parseInt(rs.getString("jmlBeli")));
                tempTransaksi.setTglTransaksi(rs.getString("tglTransaksi"));
                tempTransaksi.setWaktuTransaksi(rs.getString("waktuTransaksi"));
                tempTransaksi.setLokasiPengiriman(rs.getString("lokasiPengiriman"));
                tempTransaksi.setTglPengiriman(rs.getString("tglPengiriman"));
                tempTransaksi.setKet(rs.getString("ket"));
            }
            daftarTransaksi = new TransaksiPembelian[listTransaksi.size()];
            listTransaksi.toArray(daftarTransaksi);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return daftarTransaksi;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        
    }
    
    public boolean create(TransaksiPembelian dataTransaksi) {
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        try {
            String insert = "insert into transaksipembelian values("
                    + "'"+dataTransaksi.getKodeTransaksi()+"',"
                    + "'"+dataTransaksi.getKodeMember()+"',"
                    + "'"+dataTransaksi.getKodeOleh2()+"',"
                    + "'"+dataTransaksi.getJmlBeli()+"',"
                    + "'"+dataTransaksi.getTglTransaksi()+"',"
                    + "'"+dataTransaksi.getWaktuTransaksi()+"',"
                    + "'"+dataTransaksi.getLokasiPengiriman()+"',"
                    + "'"+dataTransaksi.getTglPengiriman()+"',"
                    + "'"+dataTransaksi.getKet()+"')";
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
    
    public boolean delete(String kodeTransaksi){
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        boolean sukses = false;
        
        try{
            String insert = "delete from transaksipembelian where kodeTransaksi='"+kodeTransaksi+"'";
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
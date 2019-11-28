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
public class TransaksiPenjualanHome {
    public TransaksiPenjualan[] getDaftarTransaksiPenjualan(){
        TransaksiPenjualan[] daftarTransaksi = null;
        TransaksiPenjualan tempTransaksi = null;
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
            int count=0;

            while (rs.next()) {
                tempTransaksi = new TransaksiPenjualan();
                tempTransaksi.setKodeTransaksi(rs.getString("kodeTransaksi"));
                tempTransaksi.setKodeMember(rs.getString("kodeMember"));
                tempTransaksi.setKodeOleh2(rs.getString("kodePusatOleh2"));
                tempTransaksi.setHarga(Integer.parseInt(rs.getString("totalHarga")));
                tempTransaksi.setTglTransaksi(rs.getString("tglTransaksi"));
                tempTransaksi.setLokasiPengiriman(rs.getString("lokasiPengiriman"));
                tempTransaksi.setTglPengiriman(rs.getString("tglPengiriman"));
                tempTransaksi.setBuktiPembayaran(rs.getString("buktiPembayaran"));
                tempTransaksi.setKet(rs.getString("ket"));
                listTransaksi.add(tempTransaksi);
                count++;
            }
            daftarTransaksi = new TransaksiPenjualan[listTransaksi.size()];
            TransaksiPenjualan.setCount(count);
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
    public TransaksiPenjualan[] getDaftarTransaksiPenjualan2(String kodePusatOleh2){
        TransaksiPenjualan[] daftarTransaksi = null;
        TransaksiPenjualan tempTransaksi = null;
        ArrayList listTransaksi = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from transaksipembelian where kodePusatOleh2='"+kodePusatOleh2+"'";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);
            int count=0;

            while (rs.next()) {
                tempTransaksi = new TransaksiPenjualan();
                tempTransaksi.setKodeTransaksi(rs.getString("kodeTransaksi"));
                tempTransaksi.setKodeMember(rs.getString("kodeMember"));
                tempTransaksi.setKodeOleh2(rs.getString("kodePusatOleh2"));
                tempTransaksi.setHarga(Integer.parseInt(rs.getString("totalHarga")));
                tempTransaksi.setTglTransaksi(rs.getString("tglTransaksi"));
                tempTransaksi.setLokasiPengiriman(rs.getString("lokasiPengiriman"));
                tempTransaksi.setTglPengiriman(rs.getString("tglPengiriman"));
                tempTransaksi.setBuktiPembayaran(rs.getString("buktiPembayaran"));
                tempTransaksi.setKet(rs.getString("ket"));
                listTransaksi.add(tempTransaksi);
                count++;
            }
            daftarTransaksi = new TransaksiPenjualan[listTransaksi.size()];
            TransaksiPenjualan.setCount(count);
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
    public TransaksiPenjualan getDaftarTransaksiPenjualan3(String kodeTransaksi){
        
        TransaksiPenjualan tempTransaksi = null;

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from transaksipembelian where kodeTransaksi='"+kodeTransaksi+"'";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempTransaksi = new TransaksiPenjualan();
                tempTransaksi.setKodeTransaksi(rs.getString("kodeTransaksi"));
                tempTransaksi.setKodeMember(rs.getString("kodeMember"));
                tempTransaksi.setKodeOleh2(rs.getString("kodePusatOleh2"));
                tempTransaksi.setHarga(Integer.parseInt(rs.getString("totalHarga")));
                tempTransaksi.setTglTransaksi(rs.getString("tglTransaksi"));
                tempTransaksi.setLokasiPengiriman(rs.getString("lokasiPengiriman"));
                tempTransaksi.setTglPengiriman(rs.getString("tglPengiriman"));
                tempTransaksi.setBuktiPembayaran(rs.getString("buktiPembayaran"));
                tempTransaksi.setKet(rs.getString("ket"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return tempTransaksi;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        
    }
    public TransaksiPenjualan[] getLastDaftarTransaksiPenjualan(){
        TransaksiPenjualan[] daftarTransaksi = null;
        TransaksiPenjualan tempTransaksi = null;
        ArrayList listTransaksi = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "SELECT t.kodeTransaksi, m.nama,t.totalHarga, t.tglTransaksi, m.gambar from transaksipembelian t, member m where t.kodeMember=m.kodeMember";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);
            int count=0;

            while (rs.next()) {
                tempTransaksi = new TransaksiPenjualan();
                tempTransaksi.setKodeTransaksi(rs.getString("t.kodeTransaksi"));
                tempTransaksi.setKodeMember(rs.getString("m.nama"));
                tempTransaksi.setHarga(Integer.parseInt(rs.getString("t.totalHarga")));
                tempTransaksi.setTglTransaksi(rs.getString("t.tglTransaksi"));
                tempTransaksi.setGambar(rs.getString("m.gambar"));
                listTransaksi.add(tempTransaksi);
                count++;
            }
            daftarTransaksi = new TransaksiPenjualan[listTransaksi.size()];
            TransaksiPenjualan.setCount(count);
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
    public TransaksiPenjualan[] getDaftarOlehPusat(){
        TransaksiPenjualan[] daftarTransaksi = null;
        TransaksiPenjualan tempTransaksi = null;
        ArrayList listTransaksi = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "SELECT o.kodeOleh2,o.nama, p.nama, o.harga from oleh2 o, pusatoleh2 p where o.kodePusatOleh2=p.kodePusatOleh2";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempTransaksi = new TransaksiPenjualan();
                tempTransaksi.setKodeOleh2(rs.getString("o.kodeOleh2"));
                tempTransaksi.setNamaOleh2(rs.getString("o.nama"));
                tempTransaksi.setNamaPusatOleh2(rs.getString("p.nama"));
                tempTransaksi.setHargaBarang(Integer.parseInt(rs.getString("o.harga")));
                listTransaksi.add(tempTransaksi);
            }
            daftarTransaksi = new TransaksiPenjualan[listTransaksi.size()];
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
    
    public boolean create(TransaksiPenjualan dataTransaksi) {
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        try {
            String insert = "insert into transaksipembelian values("
                    + "'"+dataTransaksi.getKodeTransaksi()+"',"
                    + "'"+dataTransaksi.getKodeMember()+"',"
                    + "'"+dataTransaksi.getKodeOleh2()+"',"
                    + "'"+dataTransaksi.getHarga()+"',"
                    + "'"+dataTransaksi.getTglTransaksi()+"',"
                    + "'"+dataTransaksi.getLokasiPengiriman()+"',"
                    + "'"+dataTransaksi.getTglPengiriman()+"',"
                    + "'"+dataTransaksi.getBuktiPembayaran()+"',"
                    + "'"+dataTransaksi.getKet()+"')";
            String nomor = "insert into notransaksipembelian select count(*)+1 from notransaksipembelian";
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
    
    public boolean store(TransaksiPenjualan dataTransaksi){
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        boolean sukses = false;
        
        try{
            String insert ="UPDATE transaksipembelian SET kodeMember='"+dataTransaksi.getKodeMember()+"',"
                    +"kodePusatOleh2='"+dataTransaksi.getKodeOleh2()+"',"
                    +"totalHarga='"+dataTransaksi.getHarga()+"',"
                    +"tglPengiriman='"+dataTransaksi.getTglPengiriman()+"',"
                    +"lokasiPengiriman='"+dataTransaksi.getLokasiPengiriman()+"',"
                    +"tglPengiriman='"+dataTransaksi.getTglPengiriman()+"',"
                    +"buktiPembayaran='"+dataTransaksi.getBuktiPembayaran()+"',"
                    +"ket='"+dataTransaksi.getKet()+"' WHERE kodeTransaksi='"+dataTransaksi.getKodeTransaksi()+"';";
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
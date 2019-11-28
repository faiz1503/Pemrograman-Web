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

/**
 *
 * @author DeysiFortuna
 */
public class NomorHome {

    public Nomor[] getDaftarNomor() {
        Nomor[] daftarNomor = null;
        Nomor tempNomor = null;
        ArrayList listNomor = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select nomor from nomember";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempNomor = new Nomor();
                tempNomor.setNomor(Integer.parseInt(rs.getString("nomor")));
                listNomor.add(tempNomor);
            }
            daftarNomor = new Nomor[listNomor.size()];
            listNomor.toArray(daftarNomor);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return daftarNomor;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }

    }

    public Nomor[] getDaftarNomorPusatOleh2() {
        Nomor[] daftarNomor = null;
        Nomor tempNomor = null;
        ArrayList listNomor = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select nomor from nopusatoleh2";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempNomor = new Nomor();
                tempNomor.setNomor(Integer.parseInt(rs.getString("nomor")));
                listNomor.add(tempNomor);
            }
            daftarNomor = new Nomor[listNomor.size()];
            listNomor.toArray(daftarNomor);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return daftarNomor;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public Nomor[] getDaftarNomorAdminToko() {
        Nomor[] daftarNomor = null;
        Nomor tempNomor = null;
        ArrayList listNomor = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select nomor from noadmintoko";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempNomor = new Nomor();
                tempNomor.setNomor(Integer.parseInt(rs.getString("nomor")));
                listNomor.add(tempNomor);
            }
            daftarNomor = new Nomor[listNomor.size()];
            listNomor.toArray(daftarNomor);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return daftarNomor;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
    
    public Nomor[] getDaftarNomorOleh2() {
        Nomor[] daftarNomor = null;
        Nomor tempNomor = null;
        ArrayList listNomor = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select nomor from nooleh2";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempNomor = new Nomor();
                tempNomor.setNomor(Integer.parseInt(rs.getString("nomor")));
                listNomor.add(tempNomor);
            }
            daftarNomor = new Nomor[listNomor.size()];
            listNomor.toArray(daftarNomor);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return daftarNomor;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
    
    public Nomor[] getDaftarNomorTransaksiPenjualan() {
        Nomor[] daftarNomor = null;
        Nomor tempNomor = null;
        ArrayList listNomor = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select nomor from notransaksipembelian";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempNomor = new Nomor();
                tempNomor.setNomor(Integer.parseInt(rs.getString("nomor")));
                listNomor.add(tempNomor);
            }
            daftarNomor = new Nomor[listNomor.size()];
            listNomor.toArray(daftarNomor);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return daftarNomor;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
    
    public Nomor[] getDaftarNomorArtikel() {
        Nomor[] daftarNomor = null;
        Nomor tempNomor = null;
        ArrayList listNomor = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select nomor from noartikel";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                tempNomor = new Nomor();
                tempNomor.setNomor(Integer.parseInt(rs.getString("nomor")));
                listNomor.add(tempNomor);
            }
            daftarNomor = new Nomor[listNomor.size()];
            listNomor.toArray(daftarNomor);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return daftarNomor;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}

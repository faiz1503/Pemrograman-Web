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
public class AdminTokoHome {
    public AdminToko[] getDaftarAdminToko() {
        AdminToko[] daftarAdminToko = null;
        AdminToko tempAdminToko = null;
        ArrayList listAdminToko = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from admintoko";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);
            int count=0;

            while (rs.next()) {
                tempAdminToko = new AdminToko();
                tempAdminToko.setKodeAdminToko(rs.getString("kodeAdminToko"));
                tempAdminToko.setKodePusatOleh2(rs.getString("kodePusatOleh2"));
                tempAdminToko.setId(rs.getString("id"));
                tempAdminToko.setPassword(rs.getString("password"));
                tempAdminToko.setNama(rs.getString("nama"));
                tempAdminToko.setEmail(rs.getString("email"));
                tempAdminToko.setNoHP(rs.getString("noHP"));
                tempAdminToko.setGambar(rs.getString("gambar"));
                listAdminToko.add(tempAdminToko);
                count++;
            }
            AdminToko.setCount(count);
            daftarAdminToko = new AdminToko[listAdminToko.size()];
            listAdminToko.toArray(daftarAdminToko);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return daftarAdminToko;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }

    }
    public AdminToko getDaftarAdminToko2ByKode(String email) {
        AdminToko adminToko = null;

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from admintoko where email='"+email+"'";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                adminToko = new AdminToko();
                adminToko.setKodeAdminToko(rs.getString("kodeAdminToko"));
                adminToko.setKodePusatOleh2(rs.getString("kodePusatOleh2"));
                adminToko.setId(rs.getString("id"));
                adminToko.setPassword(rs.getString("password"));
                adminToko.setNama(rs.getString("nama"));
                adminToko.setEmail(rs.getString("email"));
                adminToko.setNoHP(rs.getString("noHP"));
                adminToko.setGambar(rs.getString("gambar"));
            };
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return adminToko;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }

    }
    public AdminToko[] getLastDaftarAdminToko() {
        AdminToko[] daftarAdminToko = null;
        AdminToko tempAdminToko = null;
        ArrayList listAdminToko = new ArrayList();

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from admintoko order by kodeAdminToko desc";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);
            int count=0;

            while (rs.next()) {
                tempAdminToko = new AdminToko();
                tempAdminToko.setKodeAdminToko(rs.getString("kodeAdminToko"));
                tempAdminToko.setKodePusatOleh2(rs.getString("kodePusatOleh2"));
                tempAdminToko.setId(rs.getString("id"));
                tempAdminToko.setPassword(rs.getString("password"));
                tempAdminToko.setNama(rs.getString("nama"));
                tempAdminToko.setEmail(rs.getString("email"));
                tempAdminToko.setNoHP(rs.getString("noHP"));
                tempAdminToko.setGambar(rs.getString("gambar"));
                listAdminToko.add(tempAdminToko);
                count++;
            }
            AdminToko.setCount(count);
            daftarAdminToko = new AdminToko[listAdminToko.size()];
            listAdminToko.toArray(daftarAdminToko);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return daftarAdminToko;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }

    }
    public AdminToko getDaftarAdminTokoByKode(String kodeAdminToko) {
        AdminToko adminToko = null;

        String login = "root";
        String pwd = "";
        Connection con = null;
        ResultSet rs = null;

        Koneksi db = new Koneksi("gosurfsumatera", login, pwd);
        String sql = "Select * from admintoko where kodeAdminToko='"+kodeAdminToko+"'";

        try {
            con = db.connect();
            rs = db.executeQuery(sql);

            while (rs.next()) {
                adminToko = new AdminToko();
                adminToko.setKodeAdminToko(rs.getString("kodeAdminToko"));
                adminToko.setKodePusatOleh2(rs.getString("kodePusatOleh2"));
                adminToko.setId(rs.getString("id"));
                adminToko.setPassword(rs.getString("password"));
                adminToko.setNama(rs.getString("nama"));
                adminToko.setEmail(rs.getString("email"));
                adminToko.setNoHP(rs.getString("noHP"));
                adminToko.setGambar(rs.getString("gambar"));
            };
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                db.disconnect();
                return adminToko;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }

    }

    public boolean create(AdminToko dataAdminToko) {
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        try {
            String insert = "insert into admintoko values("
                    + "'" + dataAdminToko.getKodeAdminToko() + "',"
                    + "'" + dataAdminToko.getKodePusatOleh2() + "',"
                    + "'" + dataAdminToko.getId() + "',"
                    + "'" + dataAdminToko.getPassword() + "',"
                    + "'" + dataAdminToko.getNama() + "',"
                    + "'" + dataAdminToko.getEmail() + "',"
                    + "'" + dataAdminToko.getNoHP() + "',"
                    + "'" + dataAdminToko.getGambar() + "')";
            String nomor = "insert into noadmintoko select count(*)+1 from noadmintoko";
            akses.connect();
            akses.executeUpdate(insert);
            akses.executeUpdate(nomor);
            akses.disconnect();
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean store(AdminToko dataAdminToko) {
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        boolean sukses = false;

        try {
            String insert = "UPDATE admintoko SET id='" + dataAdminToko.getId() + "',"
                    + "password='" + dataAdminToko.getPassword() + "',"
                    + "nama='" + dataAdminToko.getNama() + "',"
                    + "email='" + dataAdminToko.getEmail() + "',"
                    + "gambar='" + dataAdminToko.getGambar() + "',"
                    + "noHP='" + dataAdminToko.getNoHP() + "' WHERE kodeAdminToko='" + dataAdminToko.getKodeAdminToko() + "' AND kodePusatOleh2='" + dataAdminToko.getKodePusatOleh2() + "';";
            akses.connect();

            int baris = akses.executeUpdate(insert);
            if (baris > 0) {
                sukses = true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                akses.disconnect();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return sukses;
    }

    public boolean delete(String kodeAdminToko) {
        Koneksi akses = new Koneksi("gosurfsumatera", "root", "");
        boolean sukses = false;

        try {
            String insert = "delete from admintoko where kodeAdminToko='" + kodeAdminToko + "'";
            akses.connect();

            int baris = akses.executeUpdate(insert);
            if (baris > 0) {
                sukses = true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                akses.disconnect();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return sukses;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Koneksi.Koneksi;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DeysiFortuna
 */
public class AdminToko {

    public String kodeAdminToko, kodePusatOleh2, id, password, nama, email, noHP, gambar;

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public Koneksi getDb() {
        return db;
    }

    public void setDb(Koneksi db) {
        this.db = db;
    }
    Koneksi db = null;
    public static int count;
    public int getCount(){
        return count;
    }
    public static void setCount(int count){
        AdminToko.count =count;
    }

    public String getKodeAdminToko() {
        return kodeAdminToko;
    }

    public void setKodeAdminToko(String kodeAdminToko) {
        this.kodeAdminToko = kodeAdminToko;
    }

    public String getKodePusatOleh2() {
        return kodePusatOleh2;
    }

    public void setKodePusatOleh2(String kodePusatOleh2) {
        this.kodePusatOleh2 = kodePusatOleh2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }
}

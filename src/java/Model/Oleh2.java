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
public class Oleh2 {
    public String kodeOleh2, kodePusatOleh2, nama, gambar;
    public int harga;
    Koneksi db=null;
    
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


    public String getKodeOleh2() {
        return kodeOleh2;
    }

    public void setKodeOleh2(String kodeOleh2) {
        this.kodeOleh2 = kodeOleh2;
    }

    public String getKodePusatOleh2() {
        return kodePusatOleh2;
    }

    public void setKodePusatOleh2(String kodePusatOleh2) {
        this.kodePusatOleh2 = kodePusatOleh2;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
}

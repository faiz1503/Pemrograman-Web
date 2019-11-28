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
public class PusatOleh2 {
    public String kodePusatOleh2, nama, alamat, kota, provinsi, gambar, noHPToko;

    public String getNoHPToko() {
        return noHPToko;
    }

    public void setNoHPToko(String noHPToko) {
        this.noHPToko = noHPToko;
    }
    Koneksi db=null;
    
    public static int count;
    public int getCount(){
        return count;
    }
    public static void setCount(int count){
        PusatOleh2.count =count;
    }


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

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }
    
    
}

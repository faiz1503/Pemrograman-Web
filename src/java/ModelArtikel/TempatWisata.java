/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelArtikel;

import Koneksi.Koneksi;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DeysiFortuna
 */
public class TempatWisata {
    public String kodeTempatWisata, judul, gambar, isi, kategori;
    Koneksi db=null;

    public String getKodeTempatWisata() {
        return kodeTempatWisata;
    }

    public void setKodeTempatWisata(String kodeTempatWisata) {
        this.kodeTempatWisata = kodeTempatWisata;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public Koneksi getDb() {
        return db;
    }

    public void setDb(Koneksi db) {
        this.db = db;
    }
    
}

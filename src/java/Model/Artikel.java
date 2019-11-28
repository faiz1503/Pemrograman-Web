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
public class Artikel {
    public String kodeArtikel, judul, isiArtikel, kategori;
    Koneksi db = null;

    public String getKodeArtikel() {
        return kodeArtikel;
    }

    public void setKodeArtikel(String kodeArtikel) {
        this.kodeArtikel = kodeArtikel;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIsiArtikel() {
        return isiArtikel;
    }

    public void setIsiArtikel(String isiArtikel) {
        this.isiArtikel = isiArtikel;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    
}

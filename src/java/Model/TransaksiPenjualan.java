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
public class TransaksiPenjualan {

    public String kodeTransaksi, kodeMember, kodeOleh2, tglTransaksi, lokasiPengiriman, tglPengiriman, BuktiPembayaran, ket, namaOleh2, namaPusatOleh2, gambar;

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
    public static int count;
    public int getCount(){
        return count;
    }
    public static void setCount(int count){
        TransaksiPenjualan.count =count;
    }

    public String getNamaOleh2() {
        return namaOleh2;
    }

    public void setNamaOleh2(String namaOleh2) {
        this.namaOleh2 = namaOleh2;
    }

    public String getNamaPusatOleh2() {
        return namaPusatOleh2;
    }

    public void setNamaPusatOleh2(String namaPusatOleh2) {
        this.namaPusatOleh2 = namaPusatOleh2;
    }
    public int jmlBeli, hargaBarang, harga;
    Koneksi db = null;

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }
    
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getBuktiPembayaran() {
        return BuktiPembayaran;
    }

    public void setBuktiPembayaran(String BuktiPembayaran) {
        this.BuktiPembayaran = BuktiPembayaran;
    }

    public Koneksi getDb() {
        return db;
    }

    public void setDb(Koneksi db) {
        this.db = db;
    }

    public String getKodeTransaksi() {
        return kodeTransaksi;
    }

    public void setKodeTransaksi(String kodeTransaksi) {
        this.kodeTransaksi = kodeTransaksi;
    }

    public String getKodeMember() {
        return kodeMember;
    }

    public void setKodeMember(String kodeMember) {
        this.kodeMember = kodeMember;
    }

    public String getKodeOleh2() {
        return kodeOleh2;
    }

    public void setKodeOleh2(String kodeOleh2) {
        this.kodeOleh2 = kodeOleh2;
    }

    public String getTglTransaksi() {
        return tglTransaksi;
    }

    public void setTglTransaksi(String tglTransaksi) {
        this.tglTransaksi = tglTransaksi;
    }

    public String getLokasiPengiriman() {
        return lokasiPengiriman;
    }

    public void setLokasiPengiriman(String lokasiPengiriman) {
        this.lokasiPengiriman = lokasiPengiriman;
    }

    public String getTglPengiriman() {
        return tglPengiriman;
    }

    public void setTglPengiriman(String tglPengiriman) {
        this.tglPengiriman = tglPengiriman;
    }

    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }

    public int getJmlBeli() {
        return jmlBeli;
    }

    public void setJmlBeli(int jmlBeli) {
        this.jmlBeli = jmlBeli;
    }

}

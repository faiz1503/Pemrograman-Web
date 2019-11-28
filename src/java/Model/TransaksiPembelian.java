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
public class TransaksiPembelian {
    public String kodeTransaksi, kodeMember, kodeOleh2, tglTransaksi, waktuTransaksi, lokasiPengiriman, tglPengiriman, ket;
    public int jmlBeli;
    Koneksi db = null;

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

    public String getWaktuTransaksi() {
        return waktuTransaksi;
    }

    public void setWaktuTransaksi(String waktuTransaksi) {
        this.waktuTransaksi = waktuTransaksi;
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

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
public class UpdateOleh2 {
    public String kodeUpdate, kodeAdminToko, kodeOleh2, tglUpdate, ket;
    Koneksi db=null;

    public String getKodeUpdate() {
        return kodeUpdate;
    }

    public void setKodeUpdate(String kodeUpdate) {
        this.kodeUpdate = kodeUpdate;
    }

    public String getKodeAdminToko() {
        return kodeAdminToko;
    }

    public void setKodeAdminToko(String kodeAdminToko) {
        this.kodeAdminToko = kodeAdminToko;
    }

    public String getKodeOleh2() {
        return kodeOleh2;
    }

    public void setKodeOleh2(String kodeOleh2) {
        this.kodeOleh2 = kodeOleh2;
    }

    public String getTglUpdate() {
        return tglUpdate;
    }

    public void setTglUpdate(String tglUpdate) {
        this.tglUpdate = tglUpdate;
    }

    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }
}

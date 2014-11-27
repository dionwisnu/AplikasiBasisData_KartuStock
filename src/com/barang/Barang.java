/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.barang;

import com.kategoriBarang.KategoriBarang;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dion Wisnu
 */
public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private KategoriBarang kategori;
    private String satuan;
    private String qtyMax;
    private String qtyMin;
    private String RitelSetelahPpn;
    private String RitelSebelumPpn;
    private String BeliSetelahPpn;
    private String BeliSebelumPpn;

    
    
    public static String cariMaxKode(String kodeKategori)
    {
        String maxCode = null;
        
        BarangControl bc = new BarangControl();
        try {
            maxCode = bc.showMaxKodeBarang(kodeKategori);
        } catch (SQLException ex) {
            Logger.getLogger(Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return maxCode;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public KategoriBarang getKategori() {
        return kategori;
    }

    public void setKategori(KategoriBarang kategori) {
        this.kategori = kategori;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getQtyMax() {
        return qtyMax;
    }

    public void setQtyMax(String qtyMax) {
        this.qtyMax = qtyMax;
    }

    public String getQtyMin() {
        return qtyMin;
    }

    public void setQtyMin(String qtyMin) {
        this.qtyMin = qtyMin;
    }

    public String getRitelSetelahPpn() {
        return RitelSetelahPpn;
    }

    public void setRitelSetelahPpn(String RitelSetelahPpn) {
        this.RitelSetelahPpn = RitelSetelahPpn;
    }

    public String getRitelSebelumPpn() {
        return RitelSebelumPpn;
    }

    public void setRitelSebelumPpn(String RitelSebelumPpn) {
        this.RitelSebelumPpn = RitelSebelumPpn;
    }

    public String getBeliSetelahPpn() {
        return BeliSetelahPpn;
    }

    public void setBeliSetelahPpn(String BeliSetelahPpn) {
        this.BeliSetelahPpn = BeliSetelahPpn;
    }

    public String getBeliSebelumPpn() {
        return BeliSebelumPpn;
    }

    public void setBeliSebelumPpn(String BeliSebelumPpn) {
        this.BeliSebelumPpn = BeliSebelumPpn;
    }

   
    
}

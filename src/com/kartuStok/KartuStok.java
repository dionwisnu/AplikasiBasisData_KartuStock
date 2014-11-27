/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kartuStok;

import com.barang.Barang;

/**
 *
 * @author Dion Wisnu
 */
public class KartuStok {

    private Barang kodeBarang;
    private String tanggal;
    private String noBukti;
    private String keterangan;
    private double masuk;
    private double keluar;
    private double saldo;

    public Barang getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(Barang kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNoBukti() {
        return noBukti;
    }

    public void setNoBukti(String noBukti) {
        this.noBukti = noBukti;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public double getMasuk() {
        return masuk;
    }

    public void setMasuk(double masuk) {
        this.masuk = masuk;
    }

    public double getKeluar() {
        return keluar;
    }

    public void setKeluar(double keluar) {
        this.keluar = keluar;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laporan;

import com.barang.Barang;
import com.kartuStok.KartuStok;
import com.kartuStok.KartuStokKontrol;
import com.tools.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dion Wisnu
 */
public class ControlLaporan {

    private Connection conn;
    private double totalMasuk;
    private double totalKeluar;

    public ControlLaporan() {
    }

    public ControlLaporan(Connection koneksi) {
        this.conn = koneksi;
    }

    public static ControlLaporan getKoneksiControlLaporan() throws SQLException {
        ControlLaporan kon = new ControlLaporan(Koneksi.getDBConnection());
        return kon;
    }

    public List<KartuStok> tampilBarang(String tanggal, String pilih) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String sql = "select ks.kode_barang, ks.tanggal, ks.masuk, ks.keluar brg.nama_barang "
                + "from kartustok ks, barang brg "
                + "where ks.kode_barang = brg.kode_barang AND ks.keterangan like '%"+pilih+"%' AND ks.tanggal = '"+tanggal+"' "
                + "order by brg.nama_barang";
        statement = conn.prepareStatement(sql);
        result = statement.executeQuery();
        List<KartuStok> kartustock = new ArrayList<KartuStok>();
        double awalMasuk = 0, awalKeluar = 0;
        double akhirMasuk = 0, akhirKeluar = 0;
        while (result.next()) {
            KartuStok ks = new KartuStok();
            Barang barang = new Barang();
            barang.setKodeBarang(result.getString("kode_barang"));
            barang.setNamaBarang(result.getString("nama_barang"));
            ks.setKodeBarang(barang);
            ks.setTanggal(result.getString("tanggal"));
            ks.setMasuk(result.getDouble("masuk"));
            ks.setKeluar(result.getDouble("keluar"));
            awalMasuk = result.getDouble("masuk");
            akhirMasuk = akhirMasuk + awalMasuk;
            awalKeluar = result.getDouble("keluar");
            akhirKeluar = akhirKeluar + awalKeluar;
            kartustock.add(ks);
        }
        setTotalKeluar(akhirKeluar);
        setTotalMasuk(akhirMasuk);
        conn.commit();
        return kartustock;
    }

    public double getTotalMasuk() {
        return totalMasuk;
    }

    public void setTotalMasuk(double totalMasuk) {
        this.totalMasuk = totalMasuk;
    }

    public double getTotalKeluar() {
        return totalKeluar;
    }

    public void setTotalKeluar(double totalKeluar) {
        this.totalKeluar = totalKeluar;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kartuStok;

import com.barang.Barang;
import com.kategoriBarang.KategoriBarang;
import com.tools.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JTable;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Dion Wisnu
 */
public class KartuStokKontrol {

    private Connection conn;

    public KartuStokKontrol() {
    }

    public KartuStokKontrol(Connection koneksi) {
        this.conn = koneksi;
    }

    public static KartuStokKontrol getKoneksiKartuStok() throws SQLException {
        KartuStokKontrol kon = new KartuStokKontrol(Koneksi.getDBConnection());
        return kon;
    }

    public void tambahKartuStokPrepared(KartuStok stock) throws SQLException {
        PreparedStatement pstmt = null;
        try {
            conn.setAutoCommit(false);
            String sql = "insert into kartustok "
                    + "(kode_barang, tanggal, no_bukti, keterangan, masuk, keluar) "
                    + "values (?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, stock.getKodeBarang().getKodeBarang());
            pstmt.setString(2, stock.getTanggal());
            pstmt.setString(3, stock.getNoBukti());
            pstmt.setString(4, stock.getKeterangan());
            pstmt.setDouble(5, stock.getMasuk());
            pstmt.setDouble(6, stock.getKeluar());
            pstmt.executeUpdate();
            conn.commit();
        } catch (SQLException exception) {
            conn.rollback();
            throw exception;
        } finally {
            try {
                conn.setAutoCommit(true);
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException exception) {
                throw exception;
            }
        }
    }

    public List<Barang> lihatSeluruhBarang(String namaBarang) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            conn.setAutoCommit(false);
            statement = conn.prepareStatement("select kode_barang,nama_barang,kategori,satuan"
                    + "from barang order by kode_barang");
            result = statement.executeQuery();
            List<Barang> kategoris = new ArrayList<Barang>();
            while (result.next()) {
                Barang listBrg = new Barang();
                KategoriBarang katBrg = new KategoriBarang();
                listBrg.setKodeBarang(result.getString("kode_barang"));
                listBrg.setNamaBarang(result.getString("nama_barang"));
                katBrg.setNamaKategori(result.getString("kategori"));
                listBrg.setKategori(katBrg);
                listBrg.setSatuan(result.getString("satuan"));
                kategoris.add(listBrg);
            }
            conn.commit();
            return kategoris;
        } catch (SQLException exception) {
            throw exception;
        }
    }

    public List<KartuStok> tampilKartuStock(String kode) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String sql = "select kode_barang, tanggal, no_bukti, keterangan, masuk, keluar from kartustok  "
                + "where kode_barang =" + kode + " order by tanggal";
        statement = conn.prepareStatement(sql);
        result = statement.executeQuery();
        List<KartuStok> kartustock = new ArrayList<KartuStok>();
        double saldoSebelum, saldoSesudah = 0;
        while (result.next()) {
            KartuStok ks = new KartuStok();
            Barang barang = new Barang();
            ks.setKodeBarang(barang);
            ks.setTanggal(result.getString("tanggal"));
            ks.setNoBukti(result.getString("no_bukti"));
            ks.setKeterangan(result.getString("keterangan"));
            ks.setMasuk(result.getDouble("masuk"));
            ks.setKeluar(result.getDouble("keluar"));
            saldoSebelum = result.getDouble("masuk") - result.getDouble("keluar");
            saldoSesudah = saldoSesudah + saldoSebelum;
            ks.setSaldo(saldoSesudah);
            kartustock.add(ks);
        }
        conn.commit();
        return kartustock;
    }

    public void cariBarang(Barang kode) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            conn.setAutoCommit(false);
            statement = conn.prepareStatement("select b.nama_barang, k.nama_kategori, b.satuan "
                    +"from kategori k, barang b "
                    +"where k.kode_kategori=b.kategori AND b.kode_barang=?");
            statement.setString(1, kode.getKodeBarang());
            result = statement.executeQuery();
            while (result.next()) {
                KategoriBarang katBrg = new KategoriBarang();
                kode.setNamaBarang(result.getString("NAMA_BARANG"));
                katBrg.setNamaKategori(result.getString("nama_KATEGORI"));
                kode.setKategori(katBrg);
                kode.setSatuan(result.getString("SATUAN"));
            }
            conn.commit();
        } catch (SQLException exception) {
            throw exception;
        }
    }
    
    public void HapusKartuStok(String key) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            conn.setAutoCommit(false);
            statement = conn.prepareStatement("delete from kartustok where no_bukti = '" + key + "'");
            result = statement.executeQuery();
            conn.commit();
        } catch (SQLException exception) {
            conn.rollback();
            throw exception;
        }
    }
    
    public void cetakTabelKartuStok(JTable table){
        String reportSource = "./KartuStok/KartuStok.jasper";
        Map<String, Object> params = new HashMap<String, Object>();
        try {
                JasperPrint jasperPrint = JasperFillManager.fillReport(reportSource, params, new JRTableModelDataSource(table.getModel()));
                JasperViewer.viewReport(jasperPrint, false);
            } catch (JRException ex) {
                ex.printStackTrace();
            }
        
    }
    
}

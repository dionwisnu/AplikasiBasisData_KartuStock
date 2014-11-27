/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.barang;

import com.kategoriBarang.KategoriBarang;
import com.tools.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dion Wisnu
 */
public class BarangControl {

    private Connection conn;

    public BarangControl() {
    }

    public BarangControl(Connection koneksi) {
        this.conn = koneksi;
    }

    public static BarangControl getKoneksiKategori() throws SQLException {
        BarangControl kon = new BarangControl(Koneksi.getDBConnection());
        return kon;
    }

    public void tambahBarangPrepared(Barang barang) throws SQLException {
        PreparedStatement pstmt = null;
        try {
            conn.setAutoCommit(false);
            String sql = "insert into barang(nama_barang,kode_barang,kategori,satuan,jumlah_max,jumlah_min,"
                    + "ritel_setelah_ppn,ritel_sebelum_ppn,beli_setelah_ppn,beli_sebelum_ppn)"
                    + " values (?,?,?,?,?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, barang.getNamaBarang());
            pstmt.setString(2, barang.getKodeBarang());
            pstmt.setString(3, barang.getKategori().getNamaKategori());
            pstmt.setString(4, barang.getSatuan());
            pstmt.setString(5, barang.getQtyMax());
            pstmt.setString(6, barang.getQtyMin());
            pstmt.setString(7, barang.getRitelSetelahPpn());
            pstmt.setString(8, barang.getRitelSebelumPpn());
            pstmt.setString(9, barang.getBeliSetelahPpn());
            pstmt.setString(10, barang.getBeliSebelumPpn());
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

    public List<Barang> lihatSeluruhBarang() throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            conn.setAutoCommit(false);
            statement = conn.prepareStatement("select kode_barang,nama_barang,ritel_setelah_ppn,beli_setelah_ppn "
                    + "from barang order by kode_barang");
            result = statement.executeQuery();
            List<Barang> kategoris = new ArrayList<Barang>();
            while (result.next()) {
                Barang listBrg = new Barang();
                listBrg.setKodeBarang(result.getString("kode_barang"));
                listBrg.setNamaBarang(result.getString("nama_barang"));
                listBrg.setRitelSetelahPpn(result.getString("ritel_setelah_ppn"));
                listBrg.setBeliSetelahPpn(result.getString("beli_setelah_ppn"));
                kategoris.add(listBrg);
            }
            conn.commit();
            return kategoris;
        } catch (SQLException exception) {
            throw exception;
        } finally {
            try {
                conn.setAutoCommit(true);
                if (result != null) {
                    result.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException exception) {
                throw exception;
            }
        }
    }

    public void HapusKategori(String key) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            conn.setAutoCommit(false);
            statement = conn.prepareStatement("delete from barang where kode_barang = '" + key + "'");
            result = statement.executeQuery();
            conn.commit();
        } catch (SQLException exception) {
            conn.rollback();
            throw exception;
        }
    }

    public List<Barang> cariBarang(String kode) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            conn.setAutoCommit(false);
            statement = conn.prepareStatement("select * from barang where kode_barang=" + kode + ";");
            result = statement.executeQuery();
            List<Barang> cariBarang = new ArrayList<Barang>();
            while (result.next()) {
                Barang listBrg = new Barang();
                KategoriBarang katBrg = new KategoriBarang();
                listBrg.setKodeBarang(result.getString("kode_barang"));
                listBrg.setNamaBarang(result.getString("nama_barang"));
                katBrg.setNamaKategori(result.getString("kategori"));
                listBrg.setKategori(katBrg);
                listBrg.setSatuan(result.getString("satuan"));
                listBrg.setRitelSetelahPpn(result.getString("ritel_setelah_ppn"));
                listBrg.setBeliSetelahPpn(result.getString("beli_setelah_ppn"));
                cariBarang.add(listBrg);
            }
            conn.commit();
            return cariBarang;
        } catch (SQLException exception) {
            throw exception;
        } finally {
            try {
                conn.setAutoCommit(true);
                if (result != null) {
                    result.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException exception) {
                throw exception;
            }
        }
    }

    public String showMaxKodeBarang(String kodeKategori) throws SQLException {
        Connection connection = null;
        Statement statemen = null;
        ResultSet rs = null;
        String maxCode = null;
        try {
            connection = Koneksi.getDBConnection();
            connection.setAutoCommit(false);
            String query = "SELECT max(kode_barang)+1 as kode_barang FROM barang WHERE kode_barang LIKE '" + kodeKategori + "%'";
            statemen = connection.createStatement();
            rs = statemen.executeQuery(query);
//            connection.commit();

            if (rs == null) {
                return kodeKategori + "1";
//                System.out.println("kolom null");
            }

            while (rs.next()) {
                maxCode = rs.getString("kode_barang");
            }

        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        } finally {
            try {
                statemen.close();
            } catch (SQLException ex) {
                System.out.println("Error : " + ex.getMessage());
            }
        }

        return maxCode;
    }

//    public Barang CariSemuaBarang(String kode) throws SQLException {
//        PreparedStatement statement = null;
//        ResultSet result = null;
////        try {
//        conn.setAutoCommit(false);
//
//        String sql = "select * from barang where kode_barang=? ";
//
//        statement = conn.prepareStatement(sql);
//        statement.setString(1, kode);
//        result = statement.executeQuery();
//        Barang barang = null;
//
//        if (result.next()) {
//            barang = new Barang();
//            KategoriBarang kategori = new KategoriBarang();
//            barang.setNamaBarang(result.getString("nama_barang"));
//            barang.setKodeBarang(result.getString("kode_barang"));
//            kategori.setNamaKategori(result.getString(3));
//            barang.setKategori(kategori);
//
//            barang.setSatuan(result.getString(4));
//            barang.setQtyMax(result.getString(5));
//            barang.setQtyMin(result.getString(6));
//
//            barang.setRitelSetelahPpn(result.getString(7));
//            barang.setRitelSebelumPpn(result.getString(8));
//            barang.setBeliSetelahPpn(result.getString(9));
//            barang.setBeliSebelumPpn(result.getString(10));
//        }
//        conn.commit();
//
//        return barang;
//    }

}

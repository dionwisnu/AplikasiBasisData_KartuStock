package com.kategoriBarang;

import com.tools.Koneksi;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class KategoriKontrol {

    private Connection conn;

    public KategoriKontrol(Connection koneksi) {
        this.conn = koneksi;
    }

    public static KategoriKontrol getKoneksiKategori() throws SQLException {
        KategoriKontrol kon = new KategoriKontrol(Koneksi.getDBConnection());
        return kon;
    }

//    public void tambahKategori(KategoriBarang kategori) throws SQLException {
//        String kode = kategori.getKodeKategori();
//        String nama = kategori.getNamaKategori();
//        String sql = "insert into kategori(kode_kategori,nama_kategori) "
//                + "values('" + kode + "','" + nama + "')";
//        Statement stat = (Statement) conn.createStatement();
//        stat.executeUpdate(sql);
//        conn.close();
//    }
    public void tambahKategoriPrepared(KategoriBarang kategori) throws SQLException {
        PreparedStatement pstmt = null;
        try {
            conn.setAutoCommit(false);
            String sql = "insert into kategori(kode_kategori,nama_kategori)"
                    + "values (?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, kategori.getKodeKategori());
            pstmt.setString(2, kategori.getNamaKategori());
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

    public String cariKategori(String kode) throws SQLException {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String namaKat = "";
        try {
            conn.setAutoCommit(false);
            String sql = "select nama_kategori from kategori where kode_kategori = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, kode);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                namaKat = rs.getString("nama_kategori");
            }
            return namaKat;
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

    public List<KategoriBarang> lihatSeluruhKateogri() throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            conn.setAutoCommit(false);
            statement = conn.prepareStatement("select kode_kategori,"
                    + "nama_kategori "
                    + "from kategori order by kode_kategori");
            result = statement.executeQuery();
            List<KategoriBarang> kategoris = new ArrayList<KategoriBarang>();
            while (result.next()) {
                KategoriBarang kategori = new KategoriBarang();
                kategori.setKodeKategori(result.getString("kode_kategori"));
                kategori.setNamaKategori(result.getString("nama_kategori"));
                kategoris.add(kategori);
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
            statement = conn.prepareStatement("delete from kategori where kode_kategori = '" + key + "'");
            result = statement.executeQuery();
            conn.commit();
        } catch (SQLException exception) {
            conn.rollback();
            throw exception;
        }
    }

    public void UpdateKategori(String kode, String nama) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            conn.setAutoCommit(false);
            statement = conn.prepareStatement("update kategori set nama_kategori ='" + nama + "' where kode_kategori = '" + kode + "'");
            result = statement.executeQuery();
            conn.commit();
        } catch (SQLException exception) {
            conn.rollback();
            throw exception;
        }
    }

    public String cariKode(KategoriBarang kategori) throws SQLException {
        String kodeb = kategori.getKodeKategori();
        Statement stmt = conn.createStatement();
        String sql = "select to_char ((count(*)+1), '0009') AS kode from barang where kodebarang='" + kodeb + "'";
        String baris = "";
        ResultSet rset = stmt.executeQuery(sql);
        while (rset.next()) {
            baris = rset.getString("kode");
        }
        conn.commit();
        conn.close();
        return baris;
    }

    public String getKodeKategori(KategoriBarang kodeKategori) throws SQLException {
        PreparedStatement preparestat = null;
        ResultSet result = null;
        String kode = "";
        try {
            conn.setAutoCommit(true);
            String sql = "select kode_kategori from kategori "
                    + "where kode_kategori =?";
            preparestat = conn.prepareStatement(sql);
            preparestat.setString(1, kodeKategori.getKodeKategori());
            result = preparestat.executeQuery();
            while (result.next()) {
                kode = result.getString("kode_kategori");
            }
            return kode;
        } catch (SQLException ex) {
            conn.rollback();
            throw ex;
        } finally {
            try {
                conn.setAutoCommit(true);
                if (preparestat != null) {
                    preparestat.close();
                }
            } catch (SQLException ex) {
                throw ex;
            }
        }
    }

}

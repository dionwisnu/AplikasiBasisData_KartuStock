/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tools;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;
import Login.*;

/**
 *
 * @author basisb01
 */
public class Koneksi {
    // string ‘localhost’ anda ganti dengan IP server yang digunakan

    Statement stmt;
    ResultSet rset;
    String query;
    String sqlString;

    public static Connection getDBConnection() {
//        String jdbcUrl = "jdbc:oracle:thin:@172.23.9.185:1521:orcl";
//        String userid = "mhs125314059";
//        String password = "mhs125314059";

    String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
    String userid = "hr";
    String password = "hr";
//        Login log = new Login();
//        String jdbcUrl = log.getUsername();
//        String userid = log.getPassword();
//        String password = log.getUrl();

        Connection conn = null;
        try {
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            conn = ds.getConnection(userid, password);
            System.out.println("Koneksi sip no...");
        } catch (SQLException ex) {
            System.out.println("Belum Terkoneksi");
        }
        return conn;
    }

//    public void close() {
//        Connection conn=null;
//        try {
//            conn.close();
//            System.out.println("Database clossed");
//        } catch (SQLException ex) {
//            System.out.println("Tidak bisa tutup koneksi");
//        }
//    }
//    
//    public static void main(String[] args) {
//        Koneksi dc = new Koneksi();
//        dc.getDBConnection();
//    }
}

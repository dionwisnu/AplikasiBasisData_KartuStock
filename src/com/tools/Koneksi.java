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
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
        String userid = "hr";
        String password = "hr";

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

    public static Connection getLocalDBConnection(String username, String pass, String url) throws SQLException{
        String jdbcUrl = "jdbc:oracle:thin:@"+url+":1521:xe";
        String userid = username;
        String password = pass;

        Connection conn = null;
//        try {
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            conn = ds.getConnection(userid, password);
            System.out.println("Koneksi sip no...");
//        } catch (SQLException ex) {
//            System.out.println("Belum Terkoneksi");
//        }
        return conn;
    }

    public static Connection getLabDBConnection(String username, String pass, String url) throws SQLException{
        String jdbcUrl = "jdbc:oracle:thin:@" + url + ":1521:orcl";
        String userid = username;
        String password = pass;
        Connection conn = null;
//        try {
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            conn = ds.getConnection(userid, password);
            System.out.println("Koneksi sip no...");
//        } catch (SQLException ex) {
//            System.out.println("Belum Terkoneksi");
//        }
        return conn;
    }
}

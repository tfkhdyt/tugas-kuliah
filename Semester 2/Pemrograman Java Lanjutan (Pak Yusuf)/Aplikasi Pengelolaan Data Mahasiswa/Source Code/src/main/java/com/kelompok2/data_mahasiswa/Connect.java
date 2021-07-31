/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok2.data_mahasiswa;

import java.sql.*;

/**
 *
 * @author user
 */
public class Connect {

//    MySQL
//    private static Connection koneksi;
//
//    public static Connection GetConnection() throws SQLException {
//        if (koneksi == null) {
//            new Driver();
//            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_mahasiswa", "root", "");
//        }
//        return koneksi;
//    }
//    SQLite
    private static Connection koneksi;

    public static Connection getConn() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("org.sqlite.JDBC");
            koneksi = DriverManager.getConnection("jdbc:sqlite:db/db_mahasiswa.db");
            System.out.println("Opened database successfully");
        } catch (SQLException se) {
            System.out.println("Gagal koneksi");

        }
        return koneksi;
    }
}

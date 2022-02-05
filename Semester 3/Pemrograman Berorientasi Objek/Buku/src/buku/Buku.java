/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buku;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class Buku {

    public static Connection con;
    public static Statement stm;
    static ResultSet rs;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            String url = "jdbc:mysql://localhost/db_buku";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            stm = con.createStatement();
            // System.out.println("koneksi berhasil");

            // buat query ke database
            String sql = "SELECT * FROM tb_buku";

            // eksekusi query dan simpan hasilnya di obj ResultSet
            rs = stm.executeQuery(sql);

            // tampilkan hasil query
            while (rs.next()) {
                System.out.println("ID Buku: " + rs.getInt("idbuku"));
                System.out.println("Judul: " + rs.getString("judul"));
                System.out.println("Pengarang: " + rs.getString("pengarang"));
                System.out.println("ISBN: " + rs.getLong("isbn"));
                System.out.println();
            }

            stm.close();
            con.close();
        } catch (Exception e) {
            System.err.println("koneksi gagal" + e.getMessage());
        }

    }

}

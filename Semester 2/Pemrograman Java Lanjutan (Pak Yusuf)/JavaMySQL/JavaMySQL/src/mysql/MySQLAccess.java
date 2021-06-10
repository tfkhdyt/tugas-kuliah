package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLAccess{
  public static void main (String[] args) {
    final String driver = "com.mysql.cj.jdbc.Driver";
    final String url = "jdbc:mysql://localhost/dbmahasiswa";
    final String username = "root";
    final String password = "";
    Connection conn = null;
    Statement stmt = null;
    try{
      // Persiapan driver dan koneksi ke database
      Class.forName(driver);
      conn = DriverManager.getConnection(url,username,password);
      // Persiapan Query
      stmt = conn.createStatement();
      String sql = "SELECT * FROM mahasiswa";
      // Eksekusi Query
      ResultSet rs = stmt.executeQuery(sql);
      // Menampilkan data hasil Query
      // Ambil satu baris data, simpan di rs, ulangi selama masih ada data
      int i = 1;
      while(rs.next()){
        // Ambil data tiap kolom
        int nim = rs.getInt("nim");
        String nama = rs.getString("nama");
        String prodi = rs.getString("prodi");
        int tinggi = rs.getInt("tinggi");
        // Menampilkan data ke layar
        System.out.println(
            i + ". NIM    : " + nim + "\n" +
                "   Nama   : " + nama + "\n" +
                "   Prodi  : " + prodi + "\n" +
                "   Tinggi : " + tinggi + " cm \n"
        );
        i++;
        //System.out.println("NIM: " + nim + ", Nama: " + nama + ", Prodi: "+ prodi + ", Tinggi: " + tinggi);
      }
      // Membersihkan resources jdbc
      rs.close();
    }catch(Exception e){
      System.out.println("Error : " + e.getMessage());
    }finally{
      // Membersihkan resources
      try{
        stmt.close();
      }catch(Exception e){}
      try{
        conn.close();
      }catch(Exception se){}
    }
    System.out.println("Aplikasi selesai!");
  }
}

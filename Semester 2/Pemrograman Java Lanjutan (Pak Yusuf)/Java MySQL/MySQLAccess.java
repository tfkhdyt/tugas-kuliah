import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLAccess{
  public static void main (String[] args) {
    final String driver = "com.mysql.jdbc.Driver";
    final String url = "jdbc:mysql://localhost/dbmahasiswa";
    final String username = "u0_a855";
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
      while(rs.next()){
        // Ambil data tiap kolom
        int nim = rs.getInt("nim");
        String nama = rs.getString("nama");
        String prodi = rs.getString("prodi");
        int tinggi = rs.getInt("tinggi");
        // Menampilkan data ke layar
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Prodi: "+ prodi + ", Tinggi: " + tinggi);
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

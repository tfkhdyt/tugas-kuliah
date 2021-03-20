import javax.swing.JOptionPane;
/**
  Nama  : Taufik Hidayat
  NIM   : 301200032
  Prodi : Teknik Informatika
*/
public class biodataJOptionPane {
    public static void main(String[] args) {
        int nim;
        String nama, ttl, alamat, email, fb, tw;

        JOptionPane.showMessageDialog(null, "Biodata Mahasiswa");
        nama = JOptionPane.showInputDialog("Masukkan Nama Anda!");
        nim = Integer.parseInt(JOptionPane.showInputDialog("Masukkan NIM Anda!"));
        ttl = JOptionPane.showInputDialog("Masukkan Tempat, Tanggal Lahir!");
        alamat = JOptionPane.showInputDialog("Masukkan Alamat!");
        email = JOptionPane.showInputDialog("Masukkan Email!");
        fb = JOptionPane.showInputDialog("Masukkan Nama Facebook!");
        tw = JOptionPane.showInputDialog("Masukkan Username Twitter!");

        System.out.println("================== Output =====================");
        System.out.println("Nama                    : " + nama);
        System.out.println("NIM                     : " + nim);
        System.out.println("Tempat, Tanggal Lahir   : " + ttl);
        System.out.println("Alamat                  : " + alamat);
        System.out.println("Email                   : " + email);
        System.out.println("Facebook                : " + fb);
        System.out.println("Twitter                 : " + tw);

    }
}

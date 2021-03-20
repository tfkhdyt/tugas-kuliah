import javax.swing.JOptionPane;
/**
  Nama  : Taufik Hidayat
  NIM   : 301200032
  Prodi : Teknik Informatika
*/
public class penjumlahanJOptionPane {
    public static void main(String[] args) {
        int bil1, bil2, hasil;

        JOptionPane.showMessageDialog(null, "Penjumlahan Sederhana");
        bil1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Bilangan 1"));
        bil2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan bilangan 2"));

        hasil = bil1 + bil2;
        System.out.println("Hasil dari " + bil1 + " + " + bil2 + " = " + hasil);
    }
}

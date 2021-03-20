import javax.swing.JOptionPane;
/**
  Nama  : Taufik Hidayat
  NIM   : 301200032
  Prodi : Teknik Informatika
*/
public class operatorJOptionPane {
    public static void main(String[] args) {
        int n1, n2, jml, h1, h2;
        boolean b1, b2, b3, b4, b5;

        JOptionPane.showMessageDialog(null, "Operator dengan Input JOptionPane");
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai 1"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai 2"));

        System.out.println("========= Aritmatika =========");
        System.out.println("Rumus");
        System.out.println("h1 = n1 + n2 * (n1 + n2)");
        System.out.println("h2 = (n1 mod 4) * n2");
        System.out.println("---------------");
        jml = n2 + n1;
        h1 = (n1 + n2) * jml;
        h2 = (n1 % 4) * n2;
        System.out.println("h1 = (" + n1 + " + " + n2 + ") * " + jml + " = " + h1);
        System.out.println("h2 = " + n1 % 4 + n2 + " = " + h2);

        System.out.println("\n========= Perbandingan =========");
        System.out.println("Rumus");
        System.out.println("b1 = h1 >= h2");
        System.out.println("b2 = h2 >= h1");
        System.out.println("b3 = (h1 mod 4) == (++h2 mod 5)");
        System.out.println("---------------");
        b1 = h1 >= h2;
        b2 = h2 >= h1;
        b3 = (h1 % 4) == (++h2 % 5);
        System.out.println("b1 = (" + h1 + " >= " + h2 + ") = " + b1);
        System.out.println("b2 = (" + h2 + " >= " + h1 + ") = " + b2);
        System.out.println("b3 = (" + (h1 % 4) + " == " + (h2 % 5) + ") = " + b3);

        System.out.println("\n========= Logika =========");
        System.out.println("Rumus");
        System.out.println("b4 = (b1 XOR b3) AND (b2 OR b3)");
        System.out.println("b5 = b2 OR (b3 AND (b3 XOR b1)");
        System.out.println("---------------");
        b4 = (b1 ^ b3) && (b2 || b3);
        b5 = (b2 || (b3 && (b3 ^ b1)));
        System.out.println("b4 = (" + b1 + " XOR " + b3 + ") AND (" + b2 + " OR " + b3 + ") = " + b4);
        System.out.println("b5 = (" + b2 + " OR (" + b3 + " AND (" + b3 + " XOR " + b1 + "))) = " + b5);
    }
}

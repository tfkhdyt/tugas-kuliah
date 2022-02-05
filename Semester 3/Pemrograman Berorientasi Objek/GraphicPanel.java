package awtbanner;

import java.awt.Frame;
import java.awt.*;
import javax.swing.JLabel;

public class GraphicPanel extends Panel {
    private String nama;

    public GraphicPanel(String nama) {
        this.nama = nama;
        setBackground(new Color(94, 212, 246));
    }

    public void paint(Graphics g) {
        g.setColor(new Color(227, 12, 12));
        g.setFont(new Font("Helvetica", Font.BOLD, 24));
        g.drawString(this.nama, 100, 125);
        g.setColor(new Color(1.0f, 0, 0));
    }

    public static void main(String[] args) {
        Frame f = new Frame("Taufik Hidayat");
        GraphicPanel gp = new GraphicPanel("Taufik Hidayat");
        f.add(gp);
        f.setSize(400, 300);
        f.setVisible(true);
    }
}

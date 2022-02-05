package awtbanner;

import java.awt.Frame;
import java.awt.*;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Administrator
 */
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
        // g.fillRect(30, 100, 150, 10);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f = new Frame("Taufik Hidayat");
        GraphicPanel gp = new GraphicPanel("Taufik Hidayat");
        f.add(gp);
        f.setSize(400, 300);
        f.setVisible(true);

    }

}

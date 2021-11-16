import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class Garis extends Applet {
  public void paint(Graphics g) {
    setBackground(Color.black);
    g.setColor(Color.green);
    int awal = 0;
    for (int i = 0; i < 10; i++) {
      g.drawLine(awal, 0, 250, 250);
      awal += 20;
    } 
  }
}

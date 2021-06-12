
package fractal1;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fractal extends JPanel {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Conjunto de mandelbrot");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.getContentPane().add(new Fractal());
        ventana.setSize(640, 640);
        ventana.setLocation(200, 50);
        ventana.setVisible(true);
    }

    public void paint(Graphics g) {
        int i, j, n, h, w;
        double x, y, cx, cy, xt, yt;
        super.paintComponent(g);
        setBackground(Color.black);
        h = getHeight() / 2;
        w = getWidth() / 2;
        for (i = 0; i < getHeight(); i++) {
            for (j = 0; j < getWidth(); j++) {
                cx = (j - w) /250.0 - 0.4;
                cy = (i - h) / 250.0;
                x = 0;
                y = 0;
                n = 0;
                while (n <100 && Math.pow(x, 2) + Math.pow(y, 2) < 4) {
                      //System.out.print(j);
                    xt = Math.pow(x, 2) - Math.pow(y, 2)+ cx;
                    yt =2 * x * y + cy;
                    x = xt;
                    y = yt;
                    ++n;
                    
                }
                if (n < 64) {
                    g.setColor( Color.BLUE);
                    g.fillRect(j, i, 1, 1);
                }
            }
        }
    }   
}


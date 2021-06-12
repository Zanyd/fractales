package fractal2;

import javax.swing.JFrame;
import java.io.*;
import java.lang.*;
import java.awt.*;

public class Fractal2 extends JFrame {

    Fractal2() {
        super("Cuadritos Recursivos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.black);
        this.setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
    }
    public void initComponent(){
    
    
    }

    public void drawFractal(int cx, int cy, int y, Graphics g) {
        g.setColor(Color.red);
        g.drawRect(cx, cy, y, y); //Cuadrote principal

        if (y > 0) {
            drawFractal(cx + 3, cy + 3, (y / 2) - 6, g); //Cuadro izquierdo arriba
            drawFractal((cx + y / 2) + 3, cy + 3, (y / 2) - 6, g); //cuadro derecho arriba
            drawFractal(cx + 3, cy + (y / 2) + 3, (y / 2) - 6, g); //cuadro izquierdo abajo
            drawFractal((cx + y / 2) + 3, cy + (y / 2) + 3, (y / 2) - 6, g); //cuadro derecho abajo

        }

    }

    public void paint(Graphics g) {
        drawFractal(0, 0, 10000, g);

    }

    public static void main(String[] args) {
        new Fractal2();
    }
}

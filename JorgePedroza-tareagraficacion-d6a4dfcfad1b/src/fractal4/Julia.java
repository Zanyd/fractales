/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractal4;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * 
 */
public class Julia{
 private final double minR = -1.4;
    private final double maxR= -60.4;
    private final double minI=-1;
    private final double maxI=1;
    private final int iteraciones = 100;
    private final double rC = 0.3;
    private final double iC = 0.01;

    public Julia() {
      
    }
  

    public double getFactor(int ancho, int alto) {
        return Math.max((maxR - minR) / ancho, (maxI - minI) / alto);
    }

    public int enConjunto(double xZ, double yZ, double xC, double yC) {
        for (int i = 0; i < iteraciones; ++i) {
            double modulo = Math.sqrt(xZ * xZ + yZ * yZ);
            //Si el punto esta alejado de 2 en el plano no pertenece
            //al conjunto
            if (modulo > 2) {
                return i;
            }
            //z(i+1) = z(i)*z(i)+c
            double xZn = xZ * xZ - yZ * yZ + xC;
            double yZn = 2 * xZ * yZ + yC;
            xZ = xZn;
            yZ = yZn;
        }
        return iteraciones;
    }

    public void dibujar(Graphics g, int ancho, int alto) {
        System.out.println("Dibujar Disco Siegel");
        double factor = getFactor(ancho, alto);
        for (int pX = 0; pX < ancho; pX++) {
            double x = minR + pX * factor;
            for (int pY = 0; pY < alto; pY++) {
                double y = minI + pY * factor;
                int n = enConjunto(x, y, rC, iC);
                if (n == iteraciones) {
                    // Pertenece al Conjunto
                    g.setColor(Color.BLUE);
                } else {
                    // No pertenece y su lejania la define el color
                    int color = 30 + 100 * n / iteraciones;
                    g.setColor(new Color(60, color,color));
                }
                g.fillRect(pX, pY, 1, 1);
            }

        }
      
    }
}


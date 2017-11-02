/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;

/**
 *
 * @author RIZAL
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class Lingkaran extends JPanel {
    
    @Override
    public void paintComponent(Graphics g){
        Gambar baru= new Gambar();
        g.setColor(Color.ORANGE);
        baru.Gambarku(g,150,200,70);
    
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gambar baru = new Gambar();
        JFrame frame  = new JFrame("Gambar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Lingkaran());
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setBackground(Color.black);
    }
    
}

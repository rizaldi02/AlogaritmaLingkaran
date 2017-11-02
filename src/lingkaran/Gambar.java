/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;

import java.awt.Graphics;

/**
 *
 * @author RIZAL
 */
public class Gambar {
    
    public void Gambarku(Graphics g,int xc,int yc,int r){
        int p=1-r;
        int x=0;
        int y=r;
        
        while(x<=y){
            
            x++;
            if(p<0){
                p+=2*x+1;
            }
            else{
                y--;
                p+=2*(x-y)+1;
          
            }
            
            g.drawRect(xc+x, yc+y, 1, 1);
            g.drawRect(xc-x, yc+y, 1, 1);
            g.drawRect(xc+x, yc-y, 1, 1);
            g.drawRect(xc-x, yc-y, 1, 1);
            g.drawRect(xc+y, yc+x, 1, 1);
            g.drawRect(xc-y, yc+x, 1, 1);
            g.drawRect(xc+y, yc-x, 1, 1);
            g.drawRect(xc-y, yc-x, 1, 1);
        
        }
        
    }
    
}

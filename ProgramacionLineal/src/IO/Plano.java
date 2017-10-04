/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class Plano extends JPanel{
        
    public Plano() {
        init();

    }


    public void init() {

        this.setBorder(BorderFactory.createLineBorder(Color.black));
    }
     @Override
    protected void paintComponent(Graphics g){    
        
             
        g.setColor(Color.red);
        g.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
        g.drawLine(this.getWidth()/2, 0,this.getWidth()/2 , this.getHeight());
        
    }
}
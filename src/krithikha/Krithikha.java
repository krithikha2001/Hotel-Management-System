/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krithikha;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;



/**
 *
 * @author krithikha
 */
public class Krithikha extends JPanel {
    int x=0,y=100;
    public void paint(Graphics g)
    {super.paint(g);
    Graphics2D g2=(Graphics2D)g;
    Font font=new Font("Georgia Pro Cond Black",Font.BOLD,100);
    g2.setFont(font);
    g2.setColor(Color.MAGENTA);
    g2.drawString("Hotel Charishma-Management record",x,y);
    
            
    
    
    
    
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        
    }

     
        // //TODO code application logic here
    
    
}

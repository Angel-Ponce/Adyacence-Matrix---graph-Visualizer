/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.awt.Component;
import javax.swing.*;

/**
 *
 * @author Angel
 */
public class Popup extends JDialog{
    
   JFrame father;
   
   public Popup(Component cmp, String name,int x, int y){
       this.setLayout(null);
       this.setLocationRelativeTo(null);
       this.setSize(x,y);
       this.setResizable(false);
       this.setBackground(Color.DARK_GRAY);
       this.setVisible(true);
       this.setTitle(name);
       this.add(cmp);
   }
    
    
}

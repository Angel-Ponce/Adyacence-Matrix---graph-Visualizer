/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Angel
 */
public class Node {
    int posx;
    int posy;
    Color color  = Color.GREEN;
    int radio;
    ArrayList<Node> conections = new ArrayList();
    ArrayList<Edge> edges = new ArrayList();
    String name;
    JLabel img;
    ArrayList<ImageIcon> bankImages = new ArrayList();
    String[] arrNames = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    public Node(int posx, int posy, int radio,String name) {
        this.posx = posx;
        this.posy = posy;
        this.radio = radio;
        this.name = name;
        getImages();
        chooseImage();
    }
       
    private void chooseImage(){
        img = new JLabel(bankImages.get(getIndexOfNamePerName(name)));
    }
    
    private void getImages(){
        for(int i = 0; i<26; i++){
            ImageIcon imagen = new ImageIcon(getClass().getResource("/images/"+arrNames[i]+".png"));
            bankImages.add(imagen);
        }
    }
    
    private int getIndexOfNamePerName(String name){
        int index = 0;
        int aux = 0;
        for(String n: arrNames){
            if(name.equals(n)){
                index = aux;
            }
            aux++;
        }
        return index;
    }
}

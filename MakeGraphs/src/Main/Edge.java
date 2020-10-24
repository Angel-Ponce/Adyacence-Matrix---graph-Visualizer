/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;

/**
 *
 * @author Angel
 */
public class Edge {
    int Xo;
    int Yo;
    int Xf;
    int Yf;
    Color color = Color.RED;
    String name;
    String nodeInitial;
    String nodeFinal;
    public Edge(String name,int Xo, int Yo, int Xf, int Yf) {
        this.Xo = Xo;
        this.Yo = Yo;
        this.Xf = Xf;
        this.Yf = Yf;
        this.name = name;
    }
    
    public Edge(String name, String nInitial, String nFinal){
        this.name = name;
        this.nodeInitial = nInitial;
        this.nodeFinal = nFinal;
    }
}

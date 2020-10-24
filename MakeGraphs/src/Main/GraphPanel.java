/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
/**
 *
 * @author Angel
 */
public class GraphPanel extends JPanel{
    ArrayList<Rectangle> rectangles = new ArrayList();
    ArrayList<Rectangle> circles = new ArrayList();
    ArrayList<Edge> edges;
    Node[] nodes;
    boolean band = false;
    JButton freeMode;
    JButton allReady;
    JPanel butonsPanel = new JPanel();
    int size;
    JButton btn;

    
    public GraphPanel(int x, int y, Node[] nodes, ArrayList<Edge> edges, boolean band,JButton btn){
        this.setLayout(null);
        this.setBackground(new Color(51,51,51));
        this.setBounds(20,20,x,y);
        this.setBorder(BorderFactory.createLineBorder(Color.ORANGE,5,true));
        this.nodes = nodes;
        this.edges = edges;
        this.band = band;
        addNodes();
        addLabelsMouseMotionListener();
        defineLines();
        this.setVisible(true);
        this.size = x;
        //First config the buttons then add panel
        configFreeMode(x);
        configAllReady(x);
        addButonsPanel(x,y);
        this.btn = btn;
    }
    
    private void addNodes(){
        for(Node n: nodes){
            this.add(n.img);
            this.repaint();
        }
    }
    
    public void defineLines(){
         rectangles.clear();
         circles.clear();
        for(Edge ed: edges){
               String init = ed.nodeInitial;
               String fin  = ed.nodeFinal;

               Node nInit = findNodePerName(init);
               Node nFin  = findNodePerName(fin);
               Rectangle rect = new Rectangle(nInit.img.getLocation().x+16,nInit.img.getLocation().y+16,nFin.img.getLocation().x+16,nFin.img.getLocation().y+16);
               rectangles.add(rect);
               
               if(nInit == nFin){
                   Rectangle cir = new Rectangle(nInit.img.getLocation().x-1,nInit.img.getLocation().y-1,35,35);
                   circles.add(cir);
               }
        }
        band = true;
        this.repaint();
    }
    
    public void addButonsPanel(int x, int y){
        butonsPanel.setBounds(20,y+30,x,30);
        butonsPanel.setLayout(null);
        butonsPanel.setVisible(true);
        butonsPanel.setBackground(new Color(51,51,51));
        butonsPanel.add(freeMode);
        butonsPanel.add(allReady);
        butonsPanel.repaint();
    }
    
    public void configFreeMode(int x){
        int sizeX = (int) Math.floor(0.55*x);
        freeMode = new JButton();
        freeMode.setBounds(0,0,sizeX,30);
        freeMode.setFont(new Font("DilleniaUPC",Font.BOLD,20));
        freeMode.setBackground(new Color(102,255,255));
        freeMode.setText("Mover");
        freeMode.setVisible(true);
        JPanel th = this;
        freeMode.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               band = false;
               th.removeAll();
               addNodes();
               th.repaint();
               allReady.setEnabled(true);
               freeMode.setEnabled(false);
               btn.setEnabled(false);
            }
        
        });
    }
    
    public void configAllReady(int x){
        int sizeX = (int) Math.floor(0.35*x);
        int exc = (int) (Math.floor(0.1*x) + Math.floor(0.55*x));
        allReady = new JButton();
        allReady.setBounds(exc,0,sizeX,30);
        allReady.setFont(new Font("DilleniaUPC",Font.BOLD,15));
        allReady.setBackground(new Color(178,255,102));
        allReady.setText("OK");
        allReady.setVisible(true);
        allReady.setEnabled(false);
        JPanel th = this;
        allReady.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                band = true;
                addNodes();
                defineLines();
                th.repaint();
                allReady.setEnabled(false);
                freeMode.setEnabled(true);
                btn.setEnabled(true);
            }
        });
        
    }
    
    private void addLabelsMouseMotionListener(){
        for(Node node: nodes){
          
             node.img.addMouseMotionListener(new MouseMotionListener(){
                @Override
                public void mouseDragged(MouseEvent me) {
                    if(band==false){
                        int x = me.getX();
                        int y = me.getY();
                        node.img.setLocation(x+node.img.getX()-16, y+node.img.getY()-16);
                    }
                }
                @Override
                public void mouseMoved(MouseEvent me) {
                }
            });   
            
        }
    }   
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(band){
            Graphics2D g2D = (Graphics2D) g;
            g2D.setStroke(new BasicStroke(3));
            g2D.setColor(Color.CYAN);
            for(Rectangle rec: rectangles){
                g2D.drawLine(rec.x, rec.y, rec.width, rec.height);
            }
            g2D.setColor(Color.RED);
            for(Rectangle cir: circles){
                g2D.drawOval(cir.x, cir.y, cir.width, cir.height);
            }
        }else{
            
        }
        
        
    }
    
    private Node findNodePerName(String name){
        Node nod = null;
        for(Node n: nodes){
            if(n.name.equals(name)){
               nod = n;
            }
        }
        return nod;
    }
    
}

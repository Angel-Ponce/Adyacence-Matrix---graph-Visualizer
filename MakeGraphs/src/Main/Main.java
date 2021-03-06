/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Angel
 */
public class Main extends javax.swing.JFrame {

    ArrayList<JTextField> tiles = new ArrayList();
    ArrayList<Edge> edges = new ArrayList();
    JTextField[][] arr2DTiles;
    int cantidadNodes = 0;
    int cantidadEdges = 0;
    Node[] nodes;
    //some names of nodes
    String[] arrNames = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    Random random = new Random();
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setTitle("Grafos");
        this.setSize(800, 700);
        this.setLocationRelativeTo(null);
        putNode.setEnabled(false);
        putEdge.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        container = new javax.swing.JPanel();
        tools = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        areaCantidad = new javax.swing.JTextField();
        putEdge = new javax.swing.JButton();
        text3 = new javax.swing.JLabel();
        autoDraw = new javax.swing.JButton();
        text2 = new javax.swing.JLabel();
        putNode = new javax.swing.JButton();
        canva = new javax.swing.JPanel();
        input = new javax.swing.JPanel();
        titleMatrix = new javax.swing.JLabel();
        barra = new javax.swing.JScrollPane();
        matrix = new javax.swing.JPanel();
        drawGraph = new javax.swing.JButton();
        generateMatrix = new javax.swing.JButton();
        output = new javax.swing.JPanel();
        barra2 = new javax.swing.JScrollPane();
        lienzo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 700));

        container.setBackground(new java.awt.Color(153, 255, 153));
        container.setLayout(new java.awt.GridBagLayout());

        tools.setBackground(new java.awt.Color(102, 102, 102));
        tools.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tools.setMaximumSize(new java.awt.Dimension(0, 0));
        tools.setMinimumSize(new java.awt.Dimension(200, 650));
        tools.setPreferredSize(new java.awt.Dimension(150, 650));
        tools.setLayout(new java.awt.GridBagLayout());

        text1.setFont(new java.awt.Font("DilleniaUPC", 1, 30)); // NOI18N
        text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text1.setText("Cantidad de nodos:");
        text1.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        tools.add(text1, gridBagConstraints);

        areaCantidad.setPreferredSize(new java.awt.Dimension(100, 30));
        areaCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaCantidadActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        tools.add(areaCantidad, gridBagConstraints);

        putEdge.setBackground(new java.awt.Color(102, 255, 102));
        putEdge.setFont(new java.awt.Font("DilleniaUPC", 1, 30)); // NOI18N
        putEdge.setText("Go!");
        putEdge.setPreferredSize(new java.awt.Dimension(25, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        tools.add(putEdge, gridBagConstraints);

        text3.setFont(new java.awt.Font("DilleniaUPC", 1, 30)); // NOI18N
        text3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text3.setText("Unir 2 nodos");
        text3.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        tools.add(text3, gridBagConstraints);

        autoDraw.setBackground(new java.awt.Color(102, 255, 102));
        autoDraw.setFont(new java.awt.Font("DilleniaUPC", 1, 30)); // NOI18N
        autoDraw.setText("Go!");
        autoDraw.setPreferredSize(new java.awt.Dimension(25, 20));
        autoDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoDrawActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 50, 0);
        tools.add(autoDraw, gridBagConstraints);

        text2.setFont(new java.awt.Font("DilleniaUPC", 1, 30)); // NOI18N
        text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text2.setText("Insertar nodo");
        text2.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        tools.add(text2, gridBagConstraints);

        putNode.setBackground(new java.awt.Color(102, 255, 102));
        putNode.setFont(new java.awt.Font("DilleniaUPC", 1, 30)); // NOI18N
        putNode.setText("Go!");
        putNode.setPreferredSize(new java.awt.Dimension(25, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 50, 0);
        tools.add(putNode, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.3;
        container.add(tools, gridBagConstraints);

        canva.setBackground(new java.awt.Color(102, 102, 102));
        canva.setMaximumSize(new java.awt.Dimension(0, 0));
        canva.setPreferredSize(new java.awt.Dimension(550, 650));
        canva.setLayout(new java.awt.GridBagLayout());

        input.setBackground(new java.awt.Color(255, 255, 255));
        input.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        input.setPreferredSize(new java.awt.Dimension(450, 300));
        input.setLayout(new java.awt.GridBagLayout());

        titleMatrix.setFont(new java.awt.Font("DilleniaUPC", 1, 30)); // NOI18N
        titleMatrix.setForeground(new java.awt.Color(0, 0, 0));
        titleMatrix.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleMatrix.setText("Matriz de adyacencia");
        titleMatrix.setPreferredSize(new java.awt.Dimension(450, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 0, 2);
        input.add(titleMatrix, gridBagConstraints);

        barra.setMinimumSize(new java.awt.Dimension(450, 300));
        barra.setPreferredSize(new java.awt.Dimension(450, 300));

        matrix.setBackground(new java.awt.Color(51, 51, 51));
        matrix.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        matrix.setMinimumSize(new java.awt.Dimension(450, 300));
        matrix.setPreferredSize(new java.awt.Dimension(2000, 2000));
        matrix.setLayout(null);
        barra.setViewportView(matrix);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        input.add(barra, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        canva.add(input, gridBagConstraints);

        drawGraph.setBackground(new java.awt.Color(102, 255, 255));
        drawGraph.setFont(new java.awt.Font("DilleniaUPC", 3, 30)); // NOI18N
        drawGraph.setText("Dibujar");
        drawGraph.setPreferredSize(new java.awt.Dimension(200, 50));
        drawGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawGraphActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        canva.add(drawGraph, gridBagConstraints);

        generateMatrix.setBackground(new java.awt.Color(102, 255, 255));
        generateMatrix.setFont(new java.awt.Font("DilleniaUPC", 3, 25)); // NOI18N
        generateMatrix.setText("Matriz de incidencia");
        generateMatrix.setPreferredSize(new java.awt.Dimension(200, 50));
        generateMatrix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateMatrixActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        canva.add(generateMatrix, gridBagConstraints);

        output.setMinimumSize(new java.awt.Dimension(450, 300));
        output.setPreferredSize(new java.awt.Dimension(450, 300));
        output.setLayout(new java.awt.GridBagLayout());

        barra2.setMinimumSize(new java.awt.Dimension(450, 300));
        barra2.setPreferredSize(new java.awt.Dimension(450, 300));

        lienzo.setBackground(new java.awt.Color(51, 51, 51));
        lienzo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lienzo.setMinimumSize(new java.awt.Dimension(450, 300));
        lienzo.setPreferredSize(new java.awt.Dimension(2000, 2000));
        lienzo.setLayout(null);
        barra2.setViewportView(lienzo);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        output.add(barra2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        canva.add(output, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        container.add(canva, gridBagConstraints);

        getContentPane().add(container, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaCantidadActionPerformed

    private void autoDrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoDrawActionPerformed
        matrix.removeAll();
        matrix.repaint();
        lienzo.removeAll();
        lienzo.repaint();
        tiles.clear();
        String cantidadT = areaCantidad.getText();
        areaCantidad.setText("");
        boolean resultado = false;
        drawGraph.setEnabled(true);
        
        try {
            Integer.parseInt(cantidadT);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
            System.err.println("Ha ocurrido la excepción: "+excepcion);
        }
        
        if(resultado){
           if(cantidadT.length()>0){
           int cantidad = Integer.parseInt(cantidadT);
           if(cantidad>=0 && cantidad<27){
                cantidadNodes = cantidad;
                Node arrNodes[] = new Node[cantidad];
                nodes = arrNodes;
                JTextField[][] arr = new JTextField[cantidad+1][cantidad+1]; 
                arr2DTiles = arr;
                int size = cantidad*40; //Prefered Size of tiles x
                int size2 = cantidad*25; //Prefered size of tiles y
                int c = 0;
                for(int i = 0; i<=size; i+=40){
                    int r = 0;
                    for(int j = 0; j<=size2; j+=25){
                        JTextField tile = new JTextField(c+" , "+r);
                        tile.setSize(40,25);
                        tile.setLocation(i+10,j+10);
                        tile.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1,true));
                        tile.setFont(new Font("Times New Roman",1,20));
                        tile.setOpaque(true);
                        matrix.add(tile);
                        matrix.repaint();
                        tiles.add(tile);
                        arr2DTiles[c][r] = tile;
                        r++;
                    }
                    c++;
                }
                //Create the nodes depending the size of matrix
                int iter = 0;
                for(Node it: arrNodes){
                    Node node = new Node(0,0,0,arrNames[iter]);
                    nodes[iter] = node;
                    iter++;
                }
                   arr2DTiles[0][0].setText("");
                   arr2DTiles[0][0].setEnabled(false);
                   arr2DTiles[0][0].setBackground(Color.ORANGE);
                //Put names of nodes at principal column
                for(int i=1; i<=cantidad; i++){
                    tiles.get(i).setText(arrNames[i-1]);
                    tiles.get(i).setFont(new Font("Times New Roman",1,16));
                    tiles.get(i).setBackground(new Color(178,255,102));
                    tiles.get(i).setEnabled(false);
                }
                //Put names of nodes at principal row
                int aux = cantidad+1;
                for(int i = 0; i<cantidad; i++){
                    tiles.get(aux).setText(arrNames[i]);
                    tiles.get(aux).setFont(new Font("Times New Roman",1,16));
                    tiles.get(aux).setBackground(new Color(178,255,102));
                    tiles.get(aux).setEnabled(false);
                    aux+=cantidad+1;
                }
                //Put white spaces on matrix
                for(JTextField it: tiles){
                    if(it.getText().contains(",")){
                        it.setText("");
                    }
                }
                
           }else{
            JOptionPane.showMessageDialog(null, "Debe ser positivo, por el momento solo se aceptan 26 nodos", "Cuidado", JOptionPane.WARNING_MESSAGE);
                cantidadNodes = 0;
           }
         
           }else{
               JOptionPane.showMessageDialog(null, "Debe ingresar una cantidad de nodos", "Cuidado", JOptionPane.WARNING_MESSAGE);
               cantidadNodes = 0;
           }
            
        }else{
               JOptionPane.showMessageDialog(null, "Debe ser un número", "Cuidado", JOptionPane.WARNING_MESSAGE);
               cantidadNodes = 0;
        }
        
    }//GEN-LAST:event_autoDrawActionPerformed

    private void drawGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawGraphActionPerformed
        if(nodes!=null){
            /*________________________________________________________________________________________*/
            /*________________________________________________________________________________________*/
            /*________________________________________________________________________________________*/
            System.out.println("Número de nodos: "+cantidadNodes);
            //Confirm exitence of nodes
            System.out.print("Nombres: ");
            for(Node it: nodes){
                System.out.print(it.name+", ");
            }
            System.out.println("\nMatriz de adyacencia: ");
            //Confirm matrix adyacence
            for(int i=1; i<cantidadNodes+1; i++){
                for(int j=1; j<cantidadNodes+1; j++){
                    System.out.print(arr2DTiles[j][i].getText()+"  ");
                }
                System.out.println("");
            }
            /*________________________________________________________________________________________*/
            /*________________________________________________________________________________________*/
            /*________________________________________________________________________________________*/
            //Interpreting the matrix
            //First validate all matrix
            boolean correctMatrix = false;
            ArrayList<String> val = new ArrayList();
            for(int i=1; i<cantidadNodes+1; i++){
                for(int j=1; j<cantidadNodes+1; j++){
                   String cont = arr2DTiles[i][j].getText();
                   val.add(cont);
                }
            }

            for(String s: val){
                if(s.equals("1") | s.equals("0")){
                    correctMatrix = true;
                }else{
                    correctMatrix = false;
                    break;
                }
            }

            if(correctMatrix){
                interprerMatrix();
                for(Node n: nodes){
                    for(Node n2: n.conections){
                        System.out.println("El nodo "+n.name+" Conecta con el nodo "+n2.name);
                    }
                }
                System.out.print("Aristas: ");
                for(Edge ed: edges){
                    System.out.print(ed.name+", ");
                }
                System.out.println("");
                //Here would be the code to draw the graph
                toGraph();
            }else{
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error en la validación de tu matriz, por favor verifica que esta solo contenga 1s o 0s", "Ups", JOptionPane.WARNING_MESSAGE);
            }
            System.out.println("---------------------------------------------------------------------------------");
        }else{
            JOptionPane.showMessageDialog(null, "No se ha encontrado una matriz :(","Error",JOptionPane.WARNING_MESSAGE);
        } 
    }//GEN-LAST:event_drawGraphActionPerformed

    private void generateMatrixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateMatrixActionPerformed
        if(nodes!=null){
            boolean correctMatrix = false;
                ArrayList<String> val = new ArrayList();
                for(int i=1; i<cantidadNodes+1; i++){
                    for(int j=1; j<cantidadNodes+1; j++){
                       String cont = arr2DTiles[i][j].getText();
                       val.add(cont);
                    }
                }

                for(String s: val){
                    if(s.equals("1") | s.equals("0")){
                        correctMatrix = true;
                    }else{
                        correctMatrix = false;
                        break;
                    }
                }
                if(correctMatrix){
                    interprerMatrix();
                    addMatrixIncidence(cantidadEdges,cantidadNodes);
                }else{
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error en la validación de tu matriz, por favor verifica que esta solo contenga 1s o 0s", "Ups", JOptionPane.WARNING_MESSAGE);
                }
        }else{
            JOptionPane.showMessageDialog(null, "No se ha encontrado una matriz :(","Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_generateMatrixActionPerformed

    public void addMatrixIncidence(int cantidad, int cantidad2){
        int size = (cantidadEdges+1)*40; //Prefered Size of tiles x
        int size2 = (cantidadNodes+1)*25; //Prefered size of tiles y
        
        JTextField[][] arr = new JTextField[cantidadEdges+1][cantidadNodes+1];
        ArrayList<JTextField> tiles = new ArrayList();
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,size,size2); 
        int c = 0;
        for(int i = 0; i<size; i+=40){
                    int r = 0;
                    for(int j = 0; j<size2; j+=25){
                        JTextField tile = new JTextField(c+" , "+r);
                        tile.setSize(40,25);
                        tile.setLocation(i,j);
                        tile.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1,true));
                        tile.setOpaque(true);
                        panel.add(tile);
                        panel.repaint();
                        arr[c][r] = tile;
                        tiles.add(tile);
                        r++;
                    }
                    c++;
        }
        
                   arr[0][0].setText("");
                   arr[0][0].setEnabled(false);
                   arr[0][0].setBackground(Color.ORANGE);
                   
                //Put names of nodes at principal column
                for(int i=1; i<=cantidad2; i++){
                    arr[0][i].setText(arrNames[i-1]);
                    arr[0][i].setFont(new Font("Times New Roman",1,16));
                    arr[0][i].setBackground(new Color(178,255,102));
                    arr[0][i].setEnabled(false);
                }
                //Put names of edges at principal row
                for(int i=1; i<=cantidad; i++){
                    arr[i][0].setText(edges.get(i-1).name);
                    arr[i][0].setFont(new Font("Times New Roman",1,16));
                    arr[i][0].setBackground(new Color(178,255,102));
                    arr[i][0].setEnabled(false);
                }
                //Put white spaces on matrix
                for(JTextField it: tiles){
                    if(it.getText().contains(",")){
                        it.setText("");
                    }
                }
                
                for(int i=1; i<cantidadEdges+1; i++){
                    String t1 = arr[i][0].getText();;
                    for(int j=1; j<cantidadNodes+1; j++){
                        String t2 = arr[0][j].getText();
                            Node node = findNodePerName(t2);
                            for(Edge ed: node.edges){
                                String variant1 = ed.nodeFinal+ed.nodeInitial;
                                String variant2 = ed.nodeInitial+ed.nodeFinal;
                                if(variant1.equals(t1) || variant2.equals(t1)){
                                    arr[i][j].setText("1");
                                }
                            }
                    }
                }
                for(int i=1; i<cantidadEdges+1; i++){
                    String t1 = arr[i][0].getText();;
                    for(int j=1; j<cantidadNodes+1; j++){
                        if(arr[i][j].getText().length()!=1){
                            arr[i][j].setText("0");
                        }
                        arr[i][j].setEnabled(false);
                        arr[i][j].setFont(new Font("Times New Roman",1,20));
                    }
                }
                
                
                
                Popup pop4 = new Popup(panel,"Matriz de incidencia",size+7,size2+29);   
    }
    
    private void interprerMatrix(){
        //Clean conections and edges
        edges.clear();
        for(Node n: nodes){
            n.conections.clear();
            n.edges.clear();
        }
        
        for(int col=1; col<cantidadNodes+1; col++){
            String nod1 = arr2DTiles[col][0].getText();
            for(int row=1; row<cantidadNodes+1; row++){
                if(arr2DTiles[col][row].getText().equals("1")){
                    //In this case, an Edge exist into nod1 and nod2
                    String nod2 = arr2DTiles[0][row].getText();
                    Edge edge = new Edge(nod1+""+nod2,nod1,nod2);
                    edges.add(edge);
                    Node node1; //First node of study
                    Node node2; //Node conection.
                    node1 = findNodePerName(nod1);
                    node2 = findNodePerName(nod2);
                    node1.conections.add(node2);
                    node1.edges.add(edge);   
                    
                }
            }
            
        }
        notRepeatEdges();
    }
    
    private void notRepeatEdges(){
        ArrayList<Edge> deletes = new ArrayList();
        cantidadEdges = 0;
        for(Edge ed: edges){
            for(Edge ed2: edges){
                if(ed.nodeInitial.equals(ed2.nodeFinal)){
                    if(ed.nodeFinal.equals(ed2.nodeInitial)){
                        int init = getIndexOfNamePerName(ed.nodeInitial);
                        int fin = getIndexOfNamePerName(ed.nodeFinal);
                        int init2 = getIndexOfNamePerName(ed2.nodeInitial);
                        int fin2 = getIndexOfNamePerName(ed2.nodeFinal);
                        if(init>fin){
                           deletes.add(ed);
                        }
                        if(init2>fin2){
                           deletes.add(ed2);
                        }
                    }
                }
            }
        }
        for(Edge ed: deletes){
            edges.remove(ed);
        }
        for(Edge ed: edges){
            cantidadEdges++;
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
    
    private void toGraph(){
        int size = cantidadNodes*32 + 100;
        lienzo.removeAll();
        lienzo.repaint();
        int randx = random.nextInt(size-32);
        int randy = random.nextInt(size-32);
        for(Node n: nodes){
          n.posx = randx;
          n.posy = randy;
          randomPositions(randx,randy,n,size-32);
          randx = random.nextInt(size-32);
          randy = random.nextInt(size-32);
        }
        for(Node n: nodes){
            n.img.setBounds(n.posx,n.posy,32,32);
        }
       
        GraphPanel graph = new GraphPanel(size,size,nodes,edges,true,drawGraph);
        
        lienzo.add(graph);
        lienzo.add(graph.butonsPanel);
        lienzo.repaint();
        
        
        
    }
    
    private void randomPositions(int randx, int randy, Node node, int size){
        double posx1 = (double) randx;
        double posy1 = (double) randy;
        for(Node n: nodes){
            double posx2 = (double) n.posx;
            double posy2 = (double) n.posy;
            double d1 = Math.pow((posx1-posx2),2);
            double d2 = Math.pow((posy1-posy2),2);
            double distance = Math.sqrt(d1+d2);
            
            if(n!=node){
               if(distance < 50){
               randx = random.nextInt(size);
               randy = random.nextInt(size);
               node.posx = randx;
               node.posy = randy;
               randomPositions(randx,randy,node,size);
                }
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaCantidad;
    private javax.swing.JButton autoDraw;
    private javax.swing.JScrollPane barra;
    private javax.swing.JScrollPane barra2;
    private javax.swing.JPanel canva;
    private javax.swing.JPanel container;
    private javax.swing.JButton drawGraph;
    private javax.swing.JButton generateMatrix;
    private javax.swing.JPanel input;
    private javax.swing.JPanel lienzo;
    private javax.swing.JPanel matrix;
    private javax.swing.JPanel output;
    private javax.swing.JButton putEdge;
    private javax.swing.JButton putNode;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel titleMatrix;
    private javax.swing.JPanel tools;
    // End of variables declaration//GEN-END:variables
}

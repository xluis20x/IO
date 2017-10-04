
package IO;

import java.io.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.PopupMenu;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import org.math.plot.Plot2DPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MetodoGrafico extends javax.swing.JFrame {   
     
    static double s1,s2,s3,x1,x2,x3,y1,y2,y3,x,y;
    public void Error () throws  NumberFormatException {
        //Extraigo los datos de las restrcciones aqui para que si meten algo que no o lo dejan bacio no truene
        try{
        x1 = Double.parseDouble(X1.getText());  
        x2 = Double.parseDouble(X2.getText());
        x3 = Double.parseDouble(X3.getText());
        
        //Aqui se extraen los datos de la segunda restrccion
        y1=  Double.parseDouble(Y1.getText());
        y2=  Double.parseDouble(Y2.getText());
        y3=  Double.parseDouble(Y3.getText());
        
        //Aqui se extraen los datos de la tercera restrccion
        
        s1=  Double.parseDouble(S1.getText());
        s2=  Double.parseDouble(S2.getText());
        s3=  Double.parseDouble(S3.getText());
        
          // Aqui se extraen los numeros de z
        x=  Double.parseDouble(X.getText());
        y=  Double.parseDouble(Y.getText());
        

        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"Has introducido algo que no es un numero o dejado en blanco una caja de texto");
        }
    }
        
    public class Graficas extends JPanel{          
    
    int rx1,rx2,rx3,rx11,rx22,rx33; 
    
    @Override    
    protected void paintComponent(Graphics g){
        
        int ejes = 0;      
        
        x1 = (int) Double.parseDouble(X1.getText());             
        y1 = (int) Double.parseDouble(Y1.getText());   
        s1 = (int) Double.parseDouble(S1.getText()); 
        
        rx1 = (int) (s1/x1);
        rx11 =  (int)  (s1/y1);
        
        //g.drawLine((int) coord_x(rx1),(int) coord_y(rx11),ejes,ejes);           
        g.drawLine(rx1, rx11,ejes,ejes);   
        
        x2 = (int) Double.parseDouble(X2.getText());
        y2 = (int) Double.parseDouble(Y2.getText());
        s2 = (int) Double.parseDouble(S2.getText()); 
        
        rx2 = (int) (s2/x2);
        rx22 =  (int)  (s2/y2);
        
        //g.drawLine((int) coord_x1(rx2),(int) coord_y1(rx22),ejes,ejes);  
        g.drawLine(rx2, rx22,ejes,ejes); 
              
        x3 = (int) Double.parseDouble(X3.getText());
        y3 = (int) Double.parseDouble(Y3.getText());
        s3 = (int) Double.parseDouble(S3.getText());
        
        rx3 = (int) (s3/x3);
        rx33 =  (int)  (s3/y3);
        
        //g.drawLine((int) coord_x2(rx3),(int) coord_y2(rx33),ejes,ejes);
        g.drawLine(rx3,rx33,ejes,ejes);
         
        
     
    }   
    
    /*private double coord_x(double rx1){

        double real_x = rx1+this.getWidth()/2;
        return real_x;
     }

     private double coord_y(double rx11){

          double real_y = -rx11+this.getHeight()/2;
          return (real_y);
     }
    
     private double coord_x1(double rx2){

         double real_x1 = rx2+this.getWidth()/2;
        return real_x1;
     }

     private double coord_y1(double rx22){

          double real_y1 = -rx22+this.getHeight()/2;
          return (real_y1);
     }
     
     private double coord_x2(double rx3){

         double real_x2 = rx3+this.getWidth()/2;
        return real_x2;
     }

     private double coord_y2(double rx33){

          double real_y2 = -rx33+this.getHeight()/2;
          return (real_y2);
     }*/
 }
    public static Plano Plano;
    
    public MetodoGrafico() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        X = new javax.swing.JTextField();
        Y = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        X1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Y1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        X2 = new javax.swing.JTextField();
        Y2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        X3 = new javax.swing.JTextField();
        Y3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        S1 = new javax.swing.JTextField();
        S2 = new javax.swing.JTextField();
        S3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Dibuja = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Funcion objetivo:");

        Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YActionPerformed(evt);
            }
        });

        jLabel2.setText("X +");

        jLabel3.setText("Sujeto a:");

        X1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X1ActionPerformed(evt);
            }
        });

        jLabel4.setText("X +");

        Y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Y1ActionPerformed(evt);
            }
        });

        jLabel5.setText("X +");

        X2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X2ActionPerformed(evt);
            }
        });

        Y2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Y2ActionPerformed(evt);
            }
        });

        jLabel6.setText("X +");

        X3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X3ActionPerformed(evt);
            }
        });

        Y3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Y3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Y");

        jLabel8.setText("Y");

        jLabel9.setText("Y");

        jLabel10.setText("Y");

        jButton1.setText("Graficar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        jLabel11.setText(">=/<=");

        jLabel12.setText(">=/<=");

        jLabel13.setText(">=/<=");

        S1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S1ActionPerformed(evt);
            }
        });

        S3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Dibuja.setText("Dibuja");
        Dibuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DibujaActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Metodo Grafico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(X2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Y2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(X3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Y3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(S2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(S3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(X1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Y1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(S1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Regresar)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton1)
                                                .addComponent(Dibuja))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)))))
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(X1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(Y1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(S1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(X2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(Y2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(S2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10)
                            .addComponent(Y3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(X3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(S3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Regresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dibuja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap(161, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void YActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YActionPerformed

    private void Y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Y2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Y2ActionPerformed

    private void S1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S1ActionPerformed

    private void S3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S3ActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        this.setVisible(false);
        Principal princi = new Principal();
        princi.setVisible(true);
        princi.setResizable(false);
        princi.setLocationRelativeTo(null);
    }//GEN-LAST:event_RegresarActionPerformed

    private void Y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Y1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Y1ActionPerformed

    private void Y3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Y3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Y3ActionPerformed

    private void X3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X3ActionPerformed

    private void X2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X2ActionPerformed

    private void X1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        dibujar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DibujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DibujaActionPerformed
          Graphics2D planoc = (Graphics2D) jPanel1.getGraphics();  
        // para que las liniesitas se vean de otro color
        
        planoc.setColor(Color.red);
       
        //De aqui hace a delante se dibujan las lineas horizontales como verticales
        
        //Linea Vertical
        planoc.drawLine(250,500,250,0);
               
        //Linea Horizontal 
        planoc.drawLine(0, 250,500, 250);
        
        //De aqui en adelante se hacen los numeros de las lienas horizontales y verticales..-..-:
          
//Aqui se hacen todos los numeros de  la linea horizontal
        //Numeros horizontales desde 250 hasta 500 
         
        int aumenta=258, cont=10;
              int numero=2;
              String numero1="1";
              planoc.setFont(new Font("Arial",0,8));
              planoc.drawString(numero1,258,262);
          do{
              String cadena= String.valueOf(numero);
              numero++;
              planoc.setFont(new Font("Arial",0,8));
              planoc.drawString(cadena,aumenta+cont,262);
              cont=cont+10;
              //System.out.println("Cont Vale"+cont);
          }while(cont<=230);
          
           
          int al=-2;
          int co=10;
          do{
              String numnegativos =String.valueOf(al);
              al--;
              planoc.setFont(new Font("Arial",0,8));
              planoc.drawString(numnegativos,233,263+co);
              co=co+10;
             // System.out.println("alexis alexis" + co);
          }while(co<=230);
   
          
          
        //Aqui se hacen los numeros desde 250 hacia atras
          int numero2=-2;
          int aumenta2=235;
          int cont2=-10;
          planoc.setFont(new Font("Arial",0,8));
          planoc.drawString("-1",235,262);
          
          do{
              String cadenanumnegativos=String.valueOf(numero2);
              numero2--;
              planoc.setFont(new Font("Arial",0,8));
              planoc.drawString(cadenanumnegativos,aumenta2+cont2,262);
              cont2=cont2-10;
              //System.out.println("aumenta " + aumenta2);
          }while(cont2>=-230); 
    
          //DE AQUI EN ADELANTE SE HACEN LOS NUMEROS DE LA LINEA VERTICAL
          
          //Aqui se hacen los numeros desde 250 hasta cero
          int alexis=225;
          int martin=10;
          planoc.setFont(new Font("Arial",0,8));
          planoc.drawString("1",238,244);
          int nun=2;
          do{
              String cadenavertical =String.valueOf(nun);
              nun++;
              planoc.setFont(new Font("Arial",0,8));
              planoc.drawString(cadenavertical,235,alexis+martin);
              martin=martin-10;
          }while(martin>= -210);
          
//De aqui en adelante se hacen las liniestias de la linea horizontal como la vertical.
        //Liniesitas verticales
        int contador = 0;
        do {
            planoc.drawLine(247, contador, 253, contador);
            contador = contador + 10;
        } while (contador <= 500);

        //Liniesitas Horizontales 
        contador = 10;
        do {
            planoc.drawLine(contador, 247, contador, 253);
            contador = contador + 10;
        } while(contador<=500);
    }//GEN-LAST:event_DibujaActionPerformed

    

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetodoGrafico().setVisible(true);
            }
        });    
        
        
        MetodoGrafico m = new MetodoGrafico();
        Plano = new Plano();
        m.add(Plano,BorderLayout.CENTER);
             
    }

   
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dibuja;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField S1;
    private javax.swing.JTextField S2;
    private javax.swing.JTextField S3;
    private javax.swing.JTextField X;
    private javax.swing.JTextField X1;
    private javax.swing.JTextField X2;
    private javax.swing.JTextField X3;
    private javax.swing.JTextField Y;
    private javax.swing.JTextField Y1;
    private javax.swing.JTextField Y2;
    private javax.swing.JTextField Y3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables


   private void dibujar(){
        MetodoGrafico.Graficas dibuj = new MetodoGrafico.Graficas();        
        dibuj.setBounds(50, 100, 1000, 1000);
        dibuj.setOpaque(false);
        jPanel1.add(dibuj);
        jPanel1.repaint();
        
    }
   

}

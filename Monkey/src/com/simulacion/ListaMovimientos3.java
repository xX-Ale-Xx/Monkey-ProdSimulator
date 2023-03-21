
package com.simulacion;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class ListaMovimientos3  extends  Thread{
    JLabel circulo;
    int posInicialX;
    int posFinalX;
    int posInicialY;
    int posFinalY;
    int veocidadGenerar;
    private boolean ejecutar;
    int dimension;
    int cantidad;
    int contador;
    JFrame panel;

    public ListaMovimientos3(JFrame panel) {
        //this.circulo = circulo;
        this.posInicialX = 180;
        this.posFinalX = 540;
        this.posInicialY = 440;
        this.posFinalY = 440;
        this.veocidadGenerar = 1000;
        this.ejecutar = true;
        this.dimension = 32;
        this.cantidad = 30;
        this.contador =0;
        this.panel =panel;
    }
    
    
    
    @Override
    public void run(){
        while (ejecutar) {            
            try {
                Thread.sleep(veocidadGenerar);
                
                if(contador<cantidad)CrearCirculo();
            } catch (InterruptedException ex) {
                Logger.getLogger(ListaMovimientos3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
 
    }
    
      private void CrearCirculo(){
          JLabel circulo = new JLabel();
          mostrarImagen(circulo);
          circulo.setVisible(true);
           panel.getContentPane().add(circulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(24,11,-1,-1));
          ProduccionToEmpaquetado mov1 = new ProduccionToEmpaquetado(circulo, posInicialX, posFinalX, posInicialY, posFinalY);
            mov1.start();
            contador++;
      }       
      
      private void mostrarImagen(JLabel cuadro){
        String ruta ="./src/com/img/verde.png";
        if(!ruta.equals("")){
            Image img = new ImageIcon(ruta).getImage();
            img = img.getScaledInstance(this.dimension, this.dimension   , Image.SCALE_SMOOTH);
            ImageIcon imgI = new ImageIcon(img);
            cuadro.setIcon(imgI);
        }
    }
}
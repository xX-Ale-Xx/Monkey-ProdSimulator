
package com.simulacion;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class ListaMovimientos5  extends  Thread{
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
    Cronometro tiempo;

    public ListaMovimientos5(JFrame panel, Cronometro tiempo) {
        //this.circulo = circulo;
        this.posInicialX = 570;
        this.posFinalX = 720;
        this.posInicialY = 140;
        this.posFinalY = 290;
        this.veocidadGenerar = 1000;
        this.ejecutar = true;
        this.dimension = 32;
        this.cantidad = 30;
        this.contador =0;
        this.panel =panel;
        this.tiempo = tiempo;
    }
    
    
    
    @Override
    public void run(){
        while (ejecutar) {            
            try {
                Thread.sleep(veocidadGenerar);
                
                if(contador<cantidad)
                    CrearCirculo();
                else{
                    Thread.sleep(1000);
                    tiempo.detener();
                    ejecutar=false;
                }
                
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
 
    }
    
      private void CrearCirculo(){
          JLabel circulo = new JLabel();
          mostrarImagen(circulo);
          circulo.setVisible(true);
           panel.getContentPane().add(circulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(24,11,-1,-1));
          SalidaToFin mov1 = new SalidaToFin(circulo, posInicialX, posFinalX, posInicialY, posFinalY);
            mov1.start();
            contador++;
      }       
      
      private void mostrarImagen(JLabel cuadro){
        String ruta ="./src/com/img/rosado.png";
        if(!ruta.equals("")){
            Image img = new ImageIcon(ruta).getImage();
            img = img.getScaledInstance(this.dimension, this.dimension   , Image.SCALE_SMOOTH);
            ImageIcon imgI = new ImageIcon(img);
            cuadro.setIcon(imgI);
        }
    }
}

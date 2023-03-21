
package com.simulacion;



import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class ProduccionToEmpaquetado extends Thread{
    
  JLabel circulo;
    int posInicialX;
    int posFinalX;
    int posInicialY;
    int posFinalY;
    int veocidad;
    private boolean ejecutar;
    int dimension;

    public ProduccionToEmpaquetado(JLabel circulo,int posInicialX, int posFinalX, int posInicialY, int posFinalY) {
        this.posInicialX = posInicialX;
        this.posFinalX = posFinalX;
        this.posInicialY = posInicialY;
        
        this.circulo=circulo;
        this.veocidad = 25;
        this.ejecutar=true;
        this.dimension = 32;
    }
    
    
    
  @Override
    public void run(){
      while (ejecutar) {          
          
          try {
              Thread.sleep(veocidad);
              mover();
          } catch (InterruptedException ex) {
              Logger.getLogger(ProduccionToEmpaquetado.class.getName()).log(Level.SEVERE, null, ex);
          }
         
          
      }
      
  
    }
    
    private void mover(){
                  if(posInicialX<=posFinalX){
              circulo.setBounds(posInicialX, posInicialY, dimension, dimension);
              posInicialX+=3;
                      System.out.println(posInicialX);
          }
          if(posInicialX>=posFinalX)
              this.ejecutar=false;
    }
    
}

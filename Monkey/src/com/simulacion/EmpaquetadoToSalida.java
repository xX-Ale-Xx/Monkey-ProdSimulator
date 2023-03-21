
package com.simulacion;



import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class EmpaquetadoToSalida extends Thread{
    
  JLabel circulo;
    int posInicialX;
    int posFinalX;
    int posInicialY;
    int posFinalY;
    int veocidad;
    private boolean ejecutar;
    int dimension;

    public EmpaquetadoToSalida(JLabel circulo,int posInicialX, int posFinalX, int posInicialY, int posFinalY) {
        this.posInicialX = posInicialX;
        this.posFinalX = posFinalX;
        this.posInicialY = posInicialY;
        this.posFinalY=posFinalY;
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
              Logger.getLogger(EmpaquetadoToSalida.class.getName()).log(Level.SEVERE, null, ex);
          }
         
          
      }
      
  
    }
    
    private void mover(){
                  if(posInicialY>=posFinalY){
              circulo.setBounds(posInicialX, posInicialY, dimension, dimension);
              posInicialY-=3;
                      System.out.println(posInicialX);
          }
                  else if(posInicialY<=posFinalY)
              this.ejecutar=false;
    }
    
}

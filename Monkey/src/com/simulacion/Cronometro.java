/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.simulacion;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Carol
 */
public class Cronometro extends Thread{
    JLabel minutos;
    JLabel segundos;
   int seg;
    private boolean ejecutar;
    int segundosT;
    private int min;

    public Cronometro(JLabel minutos,JLabel segundos, int seg) {
        this.segundos = segundos;
        this.segundosT = seg;
        this.ejecutar = true;
        this.minutos =minutos;
    this.seg =0;
    this.min=0;
    }
    
    public void detener(){
        ejecutar=false;
    }
    
    @Override
    public void run(){
        
        while (ejecutar) {            
            try {
                Thread.sleep(1000);
                if(seg<60){
                    
                segundos.setText(String.valueOf(seg));
                seg++;
                }
                if(seg==60){
                    min++;
                    seg=0;
                    segundos.setText(String.valueOf(seg));
                    minutos.setText(String.valueOf(min));
                }
                
                   
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

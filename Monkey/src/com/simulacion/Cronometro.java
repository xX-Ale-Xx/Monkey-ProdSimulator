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
    
    JLabel segundos;
   int seg;
    private boolean ejecutar;
    int segundosT;

    public Cronometro(JLabel segundos, int seg) {
        this.segundos = segundos;
        int segundosT = seg;
        this.ejecutar = true;
    this.seg =0;
    }
    
    
    
    @Override
    public void run(){
        
        while (ejecutar) {            
            try {
                Thread.sleep(1000);
                if(seg<this.segundosT){
                segundos.setText(String.valueOf(seg));
                seg++;
                }
                if(seg==this.segundosT){
                    ejecutar=false;
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ClasesPrograma;

/**
 *
 * @author Carol
 */
public class costoDeSectores {
    private int tiempo;
    private int costo;
    private int totalCosto;
    
    public costoDeSectores(int tiempo, int costo){
        this.tiempo=tiempo;
        this.costo=costo;
        this.totalCosto= tiempo *costo*30;
    }


    public int getTotalCosto() {
        return totalCosto;
    }
    

    public int getTiempo() {
        return tiempo;
    }

    public int getCosto() {
        return costo;
    }


    
}

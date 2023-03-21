/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ClasesPrograma;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class ReporteHtml {
    costoDeSectores inventario;
    costoDeSectores produccion; 
    costoDeSectores empaquetado;
    costoDeSectores salida ;
    String reporte;
    String nombre;
    public ReporteHtml(){
        this.reporte = "";
    }
    
    public boolean CrearDoc(costoDeSectores inventario, costoDeSectores produccion, costoDeSectores empaquetado, costoDeSectores salida){
        this.nombre = "Reporte";
        this.inventario= inventario;
        this.produccion=produccion; 
        this.empaquetado=empaquetado;
        this.salida=salida;
        try {
            
            /* Se crea el archivo con el nombre que se le envia*/
            FileOutputStream archivo = new FileOutputStream(nombre+".html"); 
            /* Esta instancia de OutputStreamWriter nos permitira escribir en el archivo */
            OutputStreamWriter  osw = new OutputStreamWriter (archivo, StandardCharsets.UTF_8);
            /* Metodo para crear el reporte */
            crearReporte(inventario, produccion, empaquetado, salida);
            /* Se escribe la cadena para formar el contenido del archivo */
            osw.write(this.reporte);
            /* Se cierra el documento esto siempre se debe hacer para que no se presente
            ningun problema*/
            osw.close();
            archivo.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error "+e);
            return false;
        }
    }
    
    public void crearReporte( costoDeSectores inventario, costoDeSectores produccion, costoDeSectores empaquetado, costoDeSectores salida){
        
        /* Estructura basica de un archivo HTML */
        this.reporte += "<!DOCTYPE html>\n";
        this.reporte += "<html>\n";
        this.reporte += "<head>\n";
        this.reporte += "\t<meta charset=\"utf-8\">\n";
        this.reporte += "\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n";
        /* Titulo a mostrar en la pestaña del navegador */
        this.reporte += "\t<title>Reporte Monkey</title>\n";
        this.reporte += "</head>\n";
        this.reporte += "<body>\n";
        /* Titulo a mostrar en la pagina */
        nextLine();
        this.reporte += "<img style=\"float:left; width: 50px; height: 50px;\" src=\"https://cdn-icons-png.flaticon.com/512/1998/1998721.png \">\n";
   
        this.reporte += "<h1 style=\"\">Reporte Monkey</h1>\n";
        /* Salto de linea */
        nextLine();
        nextData("Nombre: Javier Alejandro Avila Flores");
        nextData("Carnet: 202200392");
        nextLine();
        /* Creacion de la tabla de productos*/
        nuevaTabla(inventario, produccion, empaquetado, salida);
        nextLine();
        
        /* Cierre del cuerpo y del archivo HTML */
        this.reporte += "</body>\n";
        this.reporte += "</html>";
    }
    
    
    
    
    private void nextData(String dato){
        /* Se crea la etiqueta para mostrar el elemento */
        this.reporte += "\t\t<li>"+dato+"</li>\n";
    }
    
    /* **************************************************************************************************************** * 
      * **************************************************************************************************************** *
      * **************************************************************************************************************** */
    private void nuevaTabla(costoDeSectores inventario, costoDeSectores produccion, costoDeSectores empaquetado, costoDeSectores salida){
        
        /* Se crea la etiqueta que abre para una tabla */
        this.reporte += "\t<table border=\"1\">\n";
        /* Se agrega el titulo de la pagina */
         addTitulosCulomns();
       
         addRow(1,"Inventario", inventario.getTiempo(), inventario.getCosto(), inventario.getTotalCosto());
         addRow(2,"Producción", produccion.getTiempo(), produccion.getCosto(), produccion.getTotalCosto());
         addRow(3,"Empaquetado", empaquetado.getTiempo(), empaquetado.getCosto(), empaquetado.getTotalCosto());
         addRow(4,"Salida", salida.getTiempo(), salida.getCosto(), salida.getTotalCosto());
        
        this.reporte += "\t</table>\n";
    }
    
    private void addTitulosCulomns(){
        /* Se crea la etiqueta que abre la fila*/
        openRow();
        addColumn("No.");
        addColumn("Sector");
        addColumn("Tiempo");
        addColumn("Costo");
        addColumn("Costo del sector");
        /* Se crea la etiqueta que cierra la fila */
        closeRow();
    }
    
    private void addRow(int No,String sector, int tiempo, int costo, int total){
        openRow();
        addColumnNumber(No);
        addColumn(sector);
        addColumnNumber(tiempo);
        addColumnNumber(costo);
        addColumnNumber(total);
        closeRow();
    }
    
    private void addColumn(String dato){
        /* Se crea la etiqueta que abre la columna */
        openColumn();
        /* Se agraga el dato del producto */
        this.reporte += dato;
        /* Se crea la etiqueta que cierra la columna */
        closeColumn();
    }
    
    private void addColumnNumber(int dato){
        /* Se crea la etiqueta que abre la columna */
        openColumn();
        /* Se agraga el dato del producto */
        this.reporte += dato;
        /* Se crea la etiqueta que cierra la columna */
        closeColumn();
    }
    
    private void addColumnNumber(double dato){
        /* Se crea la etiqueta que abre la columna */
        openColumn();
        /* Se agraga el dato del producto */
        this.reporte += dato;
        /* Se crea la etiqueta que cierra la columna */
        closeColumn();
    } 
    
    private void openRow(){
        /* Se crea la etiqueta que abre la fila */
        this.reporte += "\t\t<tr>\n";        
    }
    
    private void closeRow(){
        /* Se crea la etiqueta que cierra la fila */
        this.reporte += "\t\t</tr>\n";
    } 
    
    private void openColumn(){
        /* Se crea la etiqueta que abre la columna */
        this.reporte += "\t\t\t<th>";        
    }
    
    private void closeColumn(){
        /* Se crea la etiqueta que cierra la columna */
        this.reporte += "</th>\n";
    } 
    
    private void nextLine(){
        /* Se crea la etiqueta para un salto de linea */
        this.reporte += "\t<br>\n";
    }
    
    public boolean AbrirArchivo(){
        try {
            /* Se obtiene el archivo a traves de File
              * al realizar la instancia se debe colocar la ruta del archivo
              * en este caso solo se coloca el nombre y la extension debido a que
              * se encuentra en la misma carpeta del proyecto */
            File path = new File(nombre+".html");
            /* Se abrira el archivo */
            Desktop.getDesktop().open(path);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    
}

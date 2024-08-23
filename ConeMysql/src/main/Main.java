/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import  conexion.*;
import java.sql.*;
import salida.SalidaPDF;
/**
 *
 * @author GAMER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Conexion c=new Conexion();
        
        //c.insertarDato("Camila");
        //c.seleccionarDatos();
        
        //Conexion2 c=new Conexion2();
        
        //c.seleccionarDatos();
       // String pdfFilePath = "resultado.pdf";

        
        //GeneraPDF pdf=new GeneraPDF();
        
        //pdf.GenerarPDF(pdfFilePath);
        
        String salida="salida.pdf";
        SalidaPDF pdf=new SalidaPDF();
        pdf.generarPDF(salida);
        
                
        
    }
    
}

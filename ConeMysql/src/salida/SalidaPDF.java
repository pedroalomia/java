/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salida;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
/**
 *
 * @author GAMER
 */
public class SalidaPDF {
    
    public  void generarPDF(String salida){
        
        PDDocument document=new PDDocument();
        PDPage page=new PDPage();
        document.addPage(page);
        
        try {
            PDPageContentStream cs=new PDPageContentStream(document, page);
            
            cs.setFont(PDType1Font.COURIER, 20);
            cs.beginText();
            cs.newLineAtOffset(100, 700);
            cs.showText("Hola Mundo!!!");
            cs.endText();
            
            cs.close();
            
            document.save(salida);
            document.close();
            
            System.out.println("Documento "+salida+" generado.");
        } catch (Exception e) {
            System.out.println("Error al generar el documento: "+e);
        }
    
        
    }
    
}

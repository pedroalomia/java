/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salida;
/*
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
*/

import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 *
 * @author GAMER
 */
public class GeneraPDF {
    
    public void GenerarPDF(String pdfFilePath){
    
        //String pdfFilePath = "resultado.pdf";
        //generarPDF(pdfFilePath);
         PDDocument document = new PDDocument();
         PDPage page = new PDPage();
         document.addPage(page);
         
         try {
            PDPageContentStream contentStream = new PDPageContentStream(document, page);
            
            contentStream.setFont(PDType1Font.HELVETICA, 12);
            contentStream.beginText();
            contentStream.newLineAtOffset(100, 700);
            contentStream.showText("Resultados de la consudfgdfglta:");
            contentStream.endText();
            
            //int y = 680;
            
            contentStream.close();

            // Guardar el documento PDF
            document.save(pdfFilePath);
            document.close();

            System.out.println("PDF generado con éxito: " + pdfFilePath);
        } catch (Exception e) {
        }
         
         
    }
    
}

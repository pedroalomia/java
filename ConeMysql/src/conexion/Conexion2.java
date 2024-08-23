/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import java.sql.*;
/**
 *
 * @author GAMER
 */
public class Conexion2 {
    
    public static final String url="jdbc:mysql://localhost:3307/prueba";
    public static final String user="root";
    public static final String pass="1234";
    
    public Connection getConnection() throws SQLException{
    
        return DriverManager.getConnection(url,user,pass);
    }
    
    public void seleccionarDatos(){
    
        String sql="SELECT * FROM tprueba";
        try (Connection c=getConnection();
                PreparedStatement p=c.prepareStatement(sql)){
            ResultSet r=p.executeQuery();
            while (r.next()) {
                String nombre=r.getString("nombre");
                System.out.println(nombre);
                
                
            }
            
        } catch (Exception e) {
        }
    }
    
}

package Clases;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SIGLO XXI-PC30
 */
public class ConectarBase {
 
    public Connection conectar=null;
  
  public ConectarBase(){
   try{
      Class.forName("com.mysql.jdbc.Driver");
      String user="root";
      String password="";
      String url="jdbc:mysql://localhost:3306/elmanitobd";
      conectar=DriverManager.getConnection(url,user,password);
      
   }catch(SQLException e){
      JOptionPane.showMessageDialog(null,"No existe la BD");
   }catch(ClassNotFoundException ex){
      JOptionPane.showMessageDialog(null,"Falta la libreria");
   }
  }
    
}

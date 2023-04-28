/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author SIGLO XXI-PC30
 */
public class Cifrar {
    char matriz[][]={{'A','H','O','V','2','9'},
        {'B','I','P','W','3','*'},
        {'C','J','Q','X','4','.'},
        {'D','K','R','Y','5','-'},
        {'E','L','S','Z','6','_'},
        {'F','M','T','0','7','#'},
        {'G','N','U','1','8','$'}};
    
  String cifrada="";
  
  public String getPassword(String password){
      //Ciclo que recorre toda la longuitud del password
    char caracter;
    for(int i=0;i<password.length();i++){
     //System.out.println(password.charAt(i));
     for(int x=0;x<7;x++){
         for(int y=0;y<6;y++){
             caracter=password.charAt(i);
             if(caracter==matriz[x][y]){
                 cifrada=cifrada+x+y;
                 break;
             }
         }
     }
  }  
    return cifrada;  

  }
    
}

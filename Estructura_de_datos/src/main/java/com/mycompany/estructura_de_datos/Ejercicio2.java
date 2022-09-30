/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_de_datos;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class Ejercicio2 {
    String Palabra="";
    
    public static String Ejercicio2(String Palabra, int contador){
        if(Palabra.length()<=0){
            Palabra=JOptionPane.showInputDialog("Digite la palabra :");
        }if (contador<=Palabra.length()-1){
            System.out.println(Palabra.charAt(contador)+"\n");
            Palabra=Ejercicio2(Palabra, contador=contador+1);
        }
        
        return Palabra;
    }
    
}

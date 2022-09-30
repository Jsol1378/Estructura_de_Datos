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
public class Ejercicio5 {
    
    public static String Ejercicio5(int tabla,int contador, boolean Iniciar){
        if (Iniciar==true){
            tabla=Integer.parseInt(JOptionPane.showInputDialog("Digite la tabla :"));
            String continuar=Ejercicio5(tabla,contador=contador+1, false);
        }if (Iniciar==false && contador<=10){
            System.out.print(tabla*contador+"\n");
            String continuar=Ejercicio5(tabla,contador=contador+1, false);
        }
        
        
        
        return "Esta fue la tabla de multiplicar de : "+tabla;
    }
}

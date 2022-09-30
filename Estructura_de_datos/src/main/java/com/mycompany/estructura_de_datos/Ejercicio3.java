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
public class Ejercicio3 {
    
    
    
    public static String Ejercicio3(int[] vector, int max, int contador){
        
        if(contador<=4){
            vector[contador]=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a ingresar"));
            if(max<=vector[contador]){
                System.out.print(vector[contador]+"\n");
                String continuar=Ejercicio3(vector,vector[contador],contador=contador+1);
            }else{
                System.out.print(vector[contador]+"\n");
                String continuar=Ejercicio3(vector,max,contador=contador+1);
            }
            
        }
        
        return "El numero maximo es "+ max;
    }
}
    
    

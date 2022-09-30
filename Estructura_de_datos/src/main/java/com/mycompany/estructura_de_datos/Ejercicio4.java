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
public class Ejercicio4 {
    
    public static double Ejercicio4(double numero, int opcion, double total){
        if(opcion==1){
            numero=Double.parseDouble(JOptionPane.showInputDialog("Digite el número a sumar ="));
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Si desea sumar otro numero digite 1, "
                    + "de lo contrario digite otro numero"));
            total=Ejercicio4(numero, opcion, total=total+numero);
        }
        
        return total;
    }
}

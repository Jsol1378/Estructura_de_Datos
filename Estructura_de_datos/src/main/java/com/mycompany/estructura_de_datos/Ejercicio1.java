/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_de_datos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para invertir: ");
        num = sc.nextInt();
        sc.close();
        System.out.printf("%nEl número %d invertido es el %s", num, invertirNumeroString(num));
        int numCifras = String.valueOf(num).length();
        System.out.printf("%nEl número %d invertido es el %d", num, invertirNumero(num, numCifras - 1));
    }

    private static int invertirNumero(int num, int pos) {
        if (num < 10) {
            return num;
        } else {
            return num % 10 * (int) Math.pow(10, pos) + invertirNumero(num / 10, pos - 1);
        }
    }

    private static String invertirNumeroString(int num) {
        if (num < 10) {
            return String.valueOf(num);
        } else {
            return String.valueOf(num % 10) + invertirNumeroString(num / 10);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum25oktober2023;

import java.util.Scanner;

/**
 *
 * @author FILIPUS FERRY
 */
public class nomor2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sisiA, sisiB, sisiC;
        
        System.out.println("Program menentukan segitiga");
        System.out.print("Masukan panjang sisi A : ");
        sisiA= in.nextDouble();
        System.out.print("Masukan panjang sisi B : ");
        sisiB= in.nextDouble();
        System.out.print("masukan panjang sisi C : ");
        sisiC= in.nextDouble();
        
        if (sisiA+sisiB > sisiC && sisiA + sisiC > sisiB && sisiB + sisiC > sisiA) {
            if (sisiA==sisiB && sisiA==sisiC) {
                System.out.println("segitiga sama sisi");
            } else if (sisiA == sisiB || sisiB == sisiC || sisiC == sisiA ) {
                System.out.println("segitiga sama kaki");
            } else if (Math.pow(sisiA, 2)== Math.pow(sisiB, 2)+Math.pow(sisiC, 2)||
                       Math.pow(sisiB, 2)== Math.pow(sisiA, 2)+Math.pow(sisiC, 2)||
                       Math.pow(sisiC, 2)== Math.pow(sisiA, 2)+Math.pow(sisiB, 2)) {
                System.out.println("segitiga siku-siku");
            } else {
                System.out.println("segitiga sembarang");
            }
            
        } else {
            System.out.println("bukan segitiga masbro");
        }
    }
}

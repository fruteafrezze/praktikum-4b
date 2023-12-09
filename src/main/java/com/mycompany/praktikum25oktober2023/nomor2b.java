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
public class nomor2b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int golongan;
        int masaKerja;
        double bonus = 0.0;
        
        System.out.println("Program Menentukan Besar Bonus Akhir Tahun");
        System.out.print("Masukan golongan (1, 2, 3, 4) : ");
        golongan=in.nextInt();
        System.out.print("Masukan masa kerja (tahun) : ");
        masaKerja=in.nextInt();
        
        switch (golongan) {
            case 1 : {
                if (masaKerja>= 0 && masaKerja <= 10) {
                    bonus = 0.5;
                } else if (masaKerja>= 11 && masaKerja <= 20) {
                    bonus = 0.6;
                } else if (masaKerja>= 21 && masaKerja <= 30) {
                    bonus = 0.7;
                }
            }
            case 2 : {
                if (masaKerja >= 0 && masaKerja <= 10) {
                    bonus = 0.6;
                } else if (masaKerja >= 11 && masaKerja <= 20) {
                    bonus = 0.7;
                } else if (masaKerja >= 21 && masaKerja <= 30) {
                    bonus = 0.8;
                }
            }
            case 3 : {
                if (masaKerja >= 0 && masaKerja <= 10) {
                    bonus = 0.7;
                } else if (masaKerja >= 11 && masaKerja <= 20) {
                    bonus = 0.8;
                } else if (masaKerja >= 21 && masaKerja <= 30) {
                    bonus = 0.9;
                }
            }
            case 4 : {
                if (masaKerja >= 0 && masaKerja <= 10) {
                    bonus = 0.8;
                } else if (masaKerja >= 11 && masaKerja <= 20) {
                    bonus = 0.9;
                } else if (masaKerja >= 21 && masaKerja <= 30) {
                    bonus = 1.0;
                }
            }
            default : System.out.println(" wahhh, sorry input salah masbro");
        }
        System.out.println("bonus akhir tahun "+bonus * 100 +"% dari golongan");
    }
}

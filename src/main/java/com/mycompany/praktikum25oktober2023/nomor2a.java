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
public class nomor2a {
    public static void main(String[] args) {
        double s, m, l, xl, xxl;
        double totalHarga = 0;
        int jumlahBaju;
        String ukuranBaju;
        s = 30000;
        m = 38000;
        l = 45000;
        xl = 50000;
        xxl = 60000;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("PROGRAM PERHITUNGAN TOTAL BELANJA");
        System.out.println("Daftar Harga Baju per buah dan Size");
        System.out.println("""
                           S    : Rp 30.000
                           M    : Rp 38.000
                           L    : Rp 45.000
                           XL   : Rp 50.000
                           XXL  : Rp 60.000
                           """);
        System.out.print("Masukan ukuran baju : ");
        ukuranBaju=in.nextLine();
        System.out.print("Masukan jumlah baju : ");
        jumlahBaju=in.nextInt();
        
        
        if (ukuranBaju.equalsIgnoreCase("s")) {
            totalHarga= s * jumlahBaju;
        } else if (ukuranBaju.equalsIgnoreCase("m")) {
            totalHarga= m * jumlahBaju;
        } else if (ukuranBaju.equalsIgnoreCase("l")) {
            totalHarga= l * jumlahBaju;
        } else if (ukuranBaju.equalsIgnoreCase("xl")) {
            totalHarga= xl * jumlahBaju;
        } else if (ukuranBaju.equalsIgnoreCase("xxl")) {
            totalHarga= xxl * jumlahBaju;
        } else {
            System.out.println("pilihan tidak valid :( ");
            
        }
        
        System.out.println("total belanjaan baju anda adalah "+totalHarga);
    }
}

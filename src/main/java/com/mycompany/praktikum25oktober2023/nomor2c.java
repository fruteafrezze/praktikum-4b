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
public class nomor2c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int tanggalLahir, bulanLahir;
        String nama, alamat, bintang;
        
        System.out.println("Program Menentukan Zodiak");
        System.out.print("Masukan nama          : ");
        nama=in.nextLine();
        System.out.print("Masukan alamat        : ");
        alamat=in.nextLine();
        System.out.print("Masukan tanggal lahir : ");
        tanggalLahir=in.nextInt();
        System.out.print("Masukan Bulan lahir   : ");
        bulanLahir=in.nextInt();
        
        if ((bulanLahir == 3 && tanggalLahir >= 21) || (bulanLahir == 4 && tanggalLahir <= 19)) {
            bintang = "Aries";
            System.out.println("Anda Berbintang       : "+bintang);
            System.out.println("sifat anda            : suka menantang diri sendiri dan sering menjadi pemimpin dalam situasi apapun");
        } else if ((bulanLahir == 4 && tanggalLahir >= 20) || (bulanLahir == 5 && tanggalLahir <= 20)) {
            bintang = "Taurus";
            System.out.println("Anda Berbintang       : "+bintang);
            System.out.println("sifat anda            : praktis dan cenderung memiliki ketahanan yang luar biasa");
        } else if ((bulanLahir == 5 && tanggalLahir >= 21) || (bulanLahir == 6 && tanggalLahir <= 20)) {
            bintang = "Gemini";
            System.out.println("Anda Berbintang       : "+bintang);
            System.out.println("sifat anda            : suka mengobrol dan memiliki banyak teman");
        }else if ((bulanLahir == 6 && tanggalLahir >= 21) || (bulanLahir == 7 && tanggalLahir <= 22)) {
            bintang = "Cancer";
            System.out.println("Anda Berbintang       : "+bintang);
            System.out.println("sifat anda            : perhatian terhadap orang lain dan cenderung sangat memperdulikan perasaan orang lain");
        }else if ((bulanLahir == 7 && tanggalLahir >= 23) || (bulanLahir == 8 && tanggalLahir <= 22)) {
            bintang = "Leo";
            System.out.println("Anda Berbintang       : "+bintang);
            System.out.println("sifat anda            : suka menjadi pusat perhatian dan selalu ingin menjadi yang terbaik dalam segala hal");
        }else if ((bulanLahir == 8 && tanggalLahir >= 23) || (bulanLahir == 9 && tanggalLahir <= 22)) {
            bintang = "Virgo";
            System.out.println("Anda Berbintang       : "+bintang);
            System.out.println("sifat anda            : suka berfokus pada detail dan selalu siap bekerja keras untuk mencapai tujuan mereka");
        }else if ((bulanLahir == 9 && tanggalLahir >= 23) || (bulanLahir == 10 && tanggalLahir <= 22)) {
            bintang = "Libra";
            System.out.println("Anda Berbintang       : "+bintang);
            System.out.println("sifat anda            : suka mengejar keindahan dan memiliki kemampuan untuk membangun hubungan yang seimbang dan harmonis dengan orang lain");
        }else if ((bulanLahir == 10 && tanggalLahir >= 23) || (bulanLahir == 11 && tanggalLahir <= 21)) {
            bintang = "Scorpio";
            System.out.println("Anda Berbintang       : "+bintang);
            System.out.println("sifat anda            : suka mengejar hal-hal yang berharga dan sangat terikat dengan emosi mereka");
        }else if ((bulanLahir == 11 && tanggalLahir >= 22) || (bulanLahir == 12 && tanggalLahir <= 21)) {
            bintang = "Sagitarius";
            System.out.println("Anda Berbintang       : "+bintang);
            System.out.println("sifat anda            : suka mengeksplorasi dunia dan memiliki keinginan yang kuat untuk belajar dan berkembang");
        }else if ((bulanLahir == 12 && tanggalLahir >= 22) || (bulanLahir == 1 && tanggalLahir <= 19)) {
            bintang = "Capricorn";
            System.out.println("Anda Berbintang       : "+bintang);
            System.out.println("sifat anda            : suka berfokus pada tujuan dan bekerja keras untuk mencapai kesuksesan");
        }else if ((bulanLahir == 1 && tanggalLahir >= 20) || (bulanLahir == 2 && tanggalLahir <= 18)) {
            bintang = "Aquarius";
            System.out.println("Anda Berbintang       : "+bintang);
            System.out.println("sifat anda            : suka mengejar ide-ide baru dan memiliki keinginan yang kuat untuk membantu orang lain");
        }else {
            bintang = "Pisces";
            System.out.println("Anda Berbintang       : "+bintang);
            System.out.println("sifat anda            : suka mengejar mimpi dan memiliki kemampuan untuk merasakan emosi orang lain");
        }
        
    }
}

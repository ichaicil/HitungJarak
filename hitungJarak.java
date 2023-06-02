/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semester2.penghitungJarak;

import java.util.Scanner;

/**
 *
 * @author ichaww
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Masukkan jarak : ");
        int jarak = scan.nextInt();
        
        float waktu = jarak /60;
        
        if (jarak < 50){
            //no tarif
            System.out.println("Estimasi waktu : dibawah 1 jam");
            System.out.println("Tarif : Rp. 0");
        }
        if (jarak > 50){
            //efisiensi 30%
            float potongan = 30 - waktu;
            System.out.println("Estimasi waktu : "+ waktu + "jam");
            System.out.println("ingin melanjutkan dengan tol? (lebih cepat " + potongan + "menit)");
            System.out.println("Tarif : Rp. 100.000");
        }
        if (jarak > 80){
            //efisiensi 35%
            float potongan = 35 - waktu;
            System.out.println("Estimasi waktu : "+ waktu + "jam");
            System.out.println("ingin melanjutkan dengan tol? (lebih cepat " + potongan + "menit)");
            System.out.println("Tarif : Rp. 135.000");
        }
        if (jarak > 150){
            //efisiensi 40%
            float potongan = 40 - waktu;
            System.out.println("Estimasi waktu : "+ waktu + "jam");
            System.out.println("ingin melanjutkan dengan tol? (lebih cepat " + potongan + "menit)");
            System.out.println("Tarif : Rp. 230.000");
        }
        
    }
    
}

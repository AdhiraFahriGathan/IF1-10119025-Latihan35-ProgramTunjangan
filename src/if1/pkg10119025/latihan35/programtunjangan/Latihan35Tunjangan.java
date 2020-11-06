/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Latihan35Tunjangan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double gaji;
        String status;
        Tunjangan tunjangan = new Tunjangan();
        System.out.println("=====Program Tunjangan====");
        System.out.print("Berapa gaji anda perbulan ? \t: Rp. ");
        gaji = scan.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) \t: ");
        status = scan.next().toUpperCase();
        tunjangan.hitung(gaji, status);
        System.out.println("(Developed by : Adhira Fahri Gathan)");
    }
}
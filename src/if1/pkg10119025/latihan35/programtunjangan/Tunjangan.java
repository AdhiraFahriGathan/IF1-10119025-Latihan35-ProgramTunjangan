/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan35.programtunjangan;

/**
 *
 * @author User
 */
public class Tunjangan {
    private double gaji, total;
    private String status;

    private double cekStatus(){
        return status.equals("MENIKAH") ? gaji * 0.35 : 0;
    }

    public void hitung(double gajiAwal, String statusNikah){
        gaji = gajiAwal;
        status = statusNikah;
        double hasil = cekStatus();
        total = gaji + hasil;
        tampil(hasil);
    }

    private void tampil(double hasil){
        System.out.println("====Hasil Perhitungan Gaji Anda====");
        System.out.println("Gaji Pokok\t\t:"+gaji);
        System.out.println("Tunjangan\t\t:"+hasil);
        System.out.println("Total Gaji\t\t:"+total);
    }
}
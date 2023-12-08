/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1.ClassObject;

/**
 *
 * @author Aharfi
 */
public class main {
    public static void main(String[] args){
        // Membuat object
        Kendaraan mobil =  new Kendaraan();
        mobil.nama = "Mobil";
        mobil.warna = "Merah";
        mobil.merk = "Toyota";
        System.out.println("Nama kendaraan : " + mobil.nama);
        System.out.println("Warna Kendaraan : " + mobil.warna);
        System.out.println("Merek Kendaraan : " + mobil.merk);
        System.out.println("Jumlah Roda : " + mobil.jmlRoda(4) +"\n");
        System.out.println("Cara Kendaraan bergerak");
        System.out.println("Saat maju : "); 
        mobil.kendaraanMaju();
        System.out.println("Saat Mundur : ");
        mobil.kendaraanMundur();
        System.out.println("Saat Berhenti : " + mobil.nama);
        mobil.kendaraanBerhenti();
    }
}

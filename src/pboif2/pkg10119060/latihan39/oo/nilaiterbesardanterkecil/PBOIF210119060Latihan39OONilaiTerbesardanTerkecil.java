/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan39.oo.nilaiterbesardanterkecil;
import java.util.Scanner;
import data.petugas;
import data.nilai;
/**
 *
  @author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Program Nilai Terbesar dan Terkecil
 */
public class PBOIF210119060Latihan39OONilaiTerbesardanTerkecil {

    
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       nilai n = new nilai();
       petugas p = new petugas();
       
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa======");
        System.out.print("Masukan Nama petugas : ");
        p.setNama(keyboard.next());
        
        System.out.print("Masukan Banyak Nilai Mahasiswa : ");
        n.setBanyakMhs(keyboard.nextInt());
        
        for(int i = 0; i < n.getBanyakMhs(); i++) {
            System.out.printf("Nilai Mahasiswa ke-" + (i+1) + " = ");
            n.setJmlNilai (keyboard.nextInt());
        }
       n.tampilHasil();
        System.out.println("\npetugas : " +p.getNama());
    }
    
}

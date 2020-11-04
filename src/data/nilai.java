/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
   @author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Program Nilai Terbesar dan Terkecil
 */
public class nilai {
    private int banyakMhs;
    private ArrayList nilai = new ArrayList();
    
    public void setBanyakMhs(int banyakMhs){
        this.banyakMhs = banyakMhs;
    }
    
    public int getBanyakMhs(){
        return banyakMhs;
    }
    
     public void setJmlNilai(int nilai){
         this.nilai.add(nilai);
     }
      public int nilaiTerbesar(){
          return(int) Collections.max(nilai);
    }
      public int nilaiTerkecil(){
          return(int) Collections.min(nilai);
      }
      public void tampilHasil(){
         System.out.println("");
        System.out.println("=====Hasil Nilai Mahasiswa====");
        for(int i = 0; i < nilai.size(); i++){
            System.out.println("Nilai Mahasiswa ke-"+(i + 1)+" = " +nilai.get(i));
      }
          System.out.println("\nNilai Terbesar adalah "+ nilaiTerbesar()); 
          System.out.println("\nNilai Terkecil adalah "+ nilaiTerkecil()); 
     }
}

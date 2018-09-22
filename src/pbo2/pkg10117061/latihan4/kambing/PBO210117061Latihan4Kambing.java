/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan4.kambing;

/**
 *
 * @author Fachrian Harits Pratama
 * Nama                 : Fachrian Harits Pratama
 * Kelas                : PBO2
 * NIM                  : 10117061
 * Deskripsi program    : Program ini berisi deklarasi  variabel label 
 *                        lalu meaksesnya
 */
public class PBO210117061Latihan4Kambing {

   public void tambahKambing(){
    // Deklarasi variabel lokal
        int jumlahKambing = 0;
      
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " +jumlahKambing);
   } 
    public static void main(String[] args) {
        PBO210117061Latihan4Kambing kambingJantan = new PBO210117061Latihan4Kambing();
        kambingJantan.tambahKambing();
        
    }
    
}

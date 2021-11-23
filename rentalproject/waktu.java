/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalproject;

import java.util.Scanner;
/**
 *
 * @author verow
 */
public class waktu {
    int tglPinjam, blnPinjam, thnPinjam, tglKembali, blnKembali,
    thnKembali;
    Scanner key = new Scanner(System.in);
    
    
    void pinjam(){
        System.out.print("Masukkan Tanggal Pinjam(1-31): ");
        tglPinjam = key.nextInt();
        System.out.print("Masukkan Bulan Pinjam(1-12): ");
        blnPinjam = key.nextInt();
        System.out.print("Masukkan Tahun Pinjam: ");
        thnPinjam = key.nextInt();
    }
      
    void kembali(){
        System.out.print("Masukkan Tanggal Kembali(1-31): ");
        tglKembali = key.nextInt();
        System.out.print("Masukkan Bulan Kembali(1-12): ");
        blnKembali = key.nextInt();
        System.out.print("Masukkan Tahun Kembali: ");
        thnKembali = key.nextInt();  
    }
    
}

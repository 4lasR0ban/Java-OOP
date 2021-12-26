/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpendataankaryawan;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author verow
 */
public class Karyawan{
    String  nama, alamat, gol, status, tglLahir;
    int  kodeKaryawan, jmlAnak;
    Scanner key = new Scanner(System.in);
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    
    Karyawan(int kode, String nama, String alamat, String tglLahir, String gol, String status, int JmlAnak){
        this.kodeKaryawan = kode;
        this.nama = nama;
        this.alamat = alamat;
        this.tglLahir = tglLahir;
        this.gol = gol;
        this.status = status;
        this.jmlAnak = JmlAnak;
    }
    
    void print(){
        LocalDate localDate = LocalDate.parse(this.tglLahir);
        LocalDate today = LocalDate.now();
        Period selisih = Period.between(localDate, today);
        System.out.println(this.kodeKaryawan+"\t"+this.nama+"\t"+this.gol+"\t"+selisih+"\t"+this.status+"\t"+this.jmlAnak);
    }
    
    void cari(){
        LocalDate localDate = LocalDate.parse(this.tglLahir);
        LocalDate today = LocalDate.now();
        Period selisih = Period.between(localDate, today);
        System.out.println("Kode Karyawan: " + this.kodeKaryawan
        + "\nNama Karyawan: " + this.nama
        + "\nGolongan: " + this.gol
        + "\nUsia: " + selisih
        + "\nStatus Menikah: " + this.status
        + "\nJumlah Anak: " + this.jmlAnak);
        int Gaji = 0, tunjanganNikah = 0, tunjanganAnak = 0, tunjangan = 0;
        if(null != this.gol)switch (this.gol) {
            case "A":
                Gaji = 5000000;
                break;
            case "B":
                Gaji = 6000000;
                break;
            case "C":
                Gaji = 7000000;
                break;
            case "D":
                Gaji = 8000000;
                break;
            default:
                break;
        }
        if (this.status == "1" || this.status == "Sudah Menikah"){
            tunjanganNikah = 10/100 * Gaji;
            tunjanganAnak = 5/100 * Gaji * this.jmlAnak;
            tunjangan = tunjanganNikah + tunjanganAnak;
        }
        int GajiKotor = Gaji + tunjangan;
        double potongan = 2.5/100 * Gaji; 
        double GajiBersih = GajiKotor - potongan;
        
        System.out.println("Gaji Pokok: Rp " + Gaji
        + "\nTunjangan Istri/Suami: Rp " + tunjanganNikah
        + "\nTunjangan Anak: Rp " + tunjanganAnak);
        System.out.println("====================================");
        System.out.println("Gaji Kotor: Rp " + GajiKotor
        + "\nPotongan: Rp " + potongan);
        System.out.println("====================================");
        System.out.println("Gaji Bersih: Rp " + GajiBersih);
    }
    
    void hitung(){
        int Gaji = 0, tunjanganNikah = 0, tunjanganAnak = 0, tunjangan = 0;
        if(this.gol == "A"){
            Gaji = 5000000;
        } else if (this.gol == "B"){
            Gaji = 6000000;
        } else if (this.gol == "C"){
            Gaji = 7000000;
        } else if (this.gol == "D"){
            Gaji = 8000000;
        }
        if (this.status == "1" || this.status == "Sudah Menikah"){
            tunjanganNikah = 10/100 * Gaji;
            tunjanganAnak = 5/100 * Gaji * this.jmlAnak;
            tunjangan = tunjanganNikah + tunjanganAnak;
        }
        int GajiKotor = Gaji + tunjangan;
        double potongan = 2.5/100 * Gaji; 
        double GajiBersih = GajiKotor - potongan;
        
        System.out.println("Gaji Pokok: Rp " + Gaji
        + "\nTunjangan Istri/Suami: Rp " + tunjanganNikah
        + "\nTunjangan Anak: Rp " + tunjanganAnak);
        System.out.println("====================================");
        System.out.println("Gaji Kotor: Rp " + GajiKotor
        + "\nPotongan: Rp " + potongan);
        System.out.println("====================================");
        System.out.println("Gaji Bersih: Rp " + GajiBersih);
    }
}

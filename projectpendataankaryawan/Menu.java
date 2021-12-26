/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpendataankaryawan;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author verow
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama, alamat, gol, status, tglLahir;
        int kode, JmlAnak = 0, input, nikah;
        Scanner key = new Scanner(System.in);
        DataKaryawan data = new DataKaryawan();
        TambahSub tambah = new TambahSub();
        HapusSub hapus = new HapusSub();
        LihatSub lihat = new LihatSub();
        CariSub find = new CariSub();
        System.out.println( "Menu Utama" );
        System.out.println( "=================================" );
        while (true){
            System.out.println( " 1. Tambah Data"
                    + "\n 2. Hapus Data"
                    + "\n 3. Lihat Data"
                    + "\n 4. Cari Data"
                    + "\n 5. Exit" );
            System.out.print( "Menu Pilihan: " );
            input = key.nextInt();
            switch ( input ){
                case 1:
                    while (true){
                        System.out.print("Masukkan kode Karyawan: ");
                        kode = key.nextInt();
                        key.nextLine();
                        System.out.print("Masukkan nama Karyawan: ");
                        nama = key.nextLine();
                        System.out.print("Masukkan alamat: ");
                        alamat = key.nextLine();
                        System.out.print("Masukkan Tanggal Lahir (yyyy-mm-dd): ");
                        tglLahir = key.nextLine();
                        System.out.print("Masukkan Golongan (A, B, C, D): ");
                        gol = key.nextLine();
                        System.out.print("Status Nikah: "
                            + "\n 1. Sudah Menikah"
                            + "\n 2. Belum Menikah"
                            + "\n Pilihan: ");
                        nikah = key.nextInt();
                        if ( nikah == 1 ){
                            status = "Sudah Menikah";
                            System.out.print("Masukkan Jumlah Anak: ");
                            JmlAnak = key.nextInt();
                        } else {
                            status = "Belum Menikah";
                        }                    
                        data.tambahKaryawan(new Karyawan(kode, nama, alamat, tglLahir, gol, status, JmlAnak));
                        if (tambah.SubMenu() == 1){
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Masukkan Kode Karyawan: ");
                    key.nextLine();
                    int caridata = key.nextInt();
                    data.hapusData(caridata);
                    if (hapus.SubMenu() == 1){
                        break;
                    }
                case 3:
                    System.out.println("==================================");
                    System.out.println("DATA KARYAWAN");
                    System.out.println("----------------------------------");
                    System.out.println("KODE\tNAMA\tGOL\tUSIA\t\tSTATUS NIKAH\tJUMLAH ANAK");
                    System.out.println("----------------------------------");
                
                    data.tampilKaryawan();
                    System.out.println("Jumlah Data: " + data.jumlahKaryawan());
                    if (lihat.SubMenu() == 1){
                        break;
                    }
                case 4:
                    System.out.println("Masukkan Kode Karyawan: ");
                    key.nextLine();
                    int cari = key.nextInt();
                    data.cariData(cari);
                    if (find.SubMenu() == 1){
                        break;
                    }
                case 5:
                    System.exit(0);
                default:
                    System.out.println( "Input tidak tepat!" );
                    break;
            }
        }
        
    }
    
}

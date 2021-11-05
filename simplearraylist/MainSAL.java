/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

/**
 *
 * @author verow
 */

import java.util.Scanner;
import java.util.ArrayList;
public class MainSAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int in;
        String input;
        TambahData plus = new TambahData();
        CariData search = new CariData();
        HapusData delete = new HapusData();
        Scanner key = new Scanner(System.in);
        ArrayList<String> dataStr = new ArrayList<String>();
        
        while (true){
            System.out.println("Menu Data ArrayList: "
                    + "\n 1. Tambah  data"
                    + "\n 2. Cari data"
                    + "\n 3. Hapus data"
                    + "\n 4. Tampil data"
                    + "\n 5. Keluar");
            System.out.print("Pilih nomor berapa: ");
            in = key.nextInt();
            
            switch(in){
                case(1):
                    plus.tambah(dataStr);
                    break;
                case(2):
                    search.cari(dataStr);
                    break;
                case(3):
                    delete.hapus(dataStr);
                    break;
                case(4):
                    System.out.println(dataStr);
                    break;
                case(5):
                    System.exit(0);
                default:
                    System.out.println("Input salah");
                    break;
            }
        }
        
    }
    
}

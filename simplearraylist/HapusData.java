/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author verow
 */
public class HapusData {
    Scanner key = new Scanner(System.in);
    void hapus(ArrayList<String> data){
        System.out.println("String yang mau dihapus: ");
        String input = key.nextLine();
        for(int i = data.size() - 1; i >= 0; --i){
            final String cari = data.get(i);
            if(cari.contains(input)){
                data.remove(i);
                System.out.println("String " + input + " sudah dihapus dalam di dalam data");
            } else {
                System.out.println("String " + input + " tidak ada dalam data.");
            }

        }
    }
}

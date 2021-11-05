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
public class CariData {
    Scanner key = new Scanner(System.in);
    void cari(ArrayList<String> data){
        System.out.println("String yang mau dicari: ");
        String input = key.nextLine();
        data.forEach((cari) -> {
            if(cari.contains(input)){
                System.out.println("String " + input + " ada di index ke " + cari.indexOf(input) + " di dalam data.");
            } else {
                System.out.println("String " + input + " tidak ada dalam data.");
            }
        });
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

/**
 *
 * @author verow
 */

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class GameTebakAngkaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int komputer = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        
        System.out.println("Hai.. nama saya Mr. Vero, "
                + "saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. "
                + "Silakan tebak ya!!!");
        
        while (true){
            System.out.print("Tebakan anda: " );
            int player = key.nextInt();
            
            if (player < komputer){
                System.out.println("tetot, terlalu kecil");
            } else if (player > komputer){
                System.out.println("tetot, terlalu besar");
            } else {
                System.out.println("Selamat anda benar");
                break;
            }
        }
    }
    
}

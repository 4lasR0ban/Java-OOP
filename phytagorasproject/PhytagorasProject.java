/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phytagorasproject;

/**
 *
 * @author verow
 */

import java.util.Scanner;

public class PhytagorasProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // atribut
        int Pilihan;
        double sisiMiring, sisiDepan;
        // obj input
        Scanner key = new Scanner(System.in);
        
        
        System.out.println("1. Cek triple pythagoras");
        System.out.println("2. Menentukan sisi miring segitiga ");
        System.out.println("3. Menentukan sisi siku-siku segitiga");
        System.out.println("4. Exit");
        
        System.out.print("Monggo dipilih: ");
        Pilihan = key.nextInt();
        
        switch (Pilihan){
            case (1):
                System.out.print("a: ");
                int aCek = key.nextInt();
                System.out.print("b: ");
                int bCek = key.nextInt();
                System.out.print("c: ");
                int cCek = key.nextInt();
                
                if (aCek*aCek + bCek*bCek == cCek*cCek){
                    System.out.println("Triple pythagoras");
                } else {
                    System.out.println("Bukan triple pythagoras");
                }
                break;
            case (2):
                System.out.print("a: ");
                int aMir = key.nextInt();
                System.out.print("b: ");
                int bMir = key.nextInt();
                
                sisiMiring = Math.sqrt((Math.pow(aMir,2)) + (Math.pow(bMir,2)));
                System.out.println("Sisi Miringnya adalah: " + sisiMiring);
                break;
            case (3):
                System.out.print("a: ");
                int aAlas = key.nextInt();
                System.out.print("c: ");
                int cAlas = key.nextInt();
                
                sisiDepan = Math.sqrt((Math.pow(cAlas, 2)) - (Math.pow(aAlas, 2)));
                System.out.println("sisi siku-sikunya adalah: " + sisiDepan);
                break;
            case (4):
                System.out.println("Dadahh");
                System.exit(0);
            default:
                System.out.println("Maaf input salah");
        }
    }
    
}

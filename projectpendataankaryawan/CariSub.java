/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpendataankaryawan;

import java.util.Scanner;

/**
 *
 * @author verow
 */
public class CariSub extends SubMenu{
    Scanner key = new Scanner(System.in);
    @Override
    int SubMenu() {
        System.out.println("Pilih Sub Menu:"
                + "\n1. Kembali ke menu utama"
                + "\nMenu Pilihan: ");
        int pilihan = key.nextInt();
        return pilihan;
    }    
}

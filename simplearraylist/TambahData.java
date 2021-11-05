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
public class TambahData {
    Scanner key = new Scanner(System.in);
    void tambah(ArrayList<String> data){
        System.out.println("Masukkan data string: ");
        String input = key.nextLine();
        data.add(input);
        System.out.println(data);
    }
}

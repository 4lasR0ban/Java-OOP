/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;

/**
 *
 * @author verow
 */
import java.util.Scanner;
import java.util.Arrays;
public class ProjectRerata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayProcessing arr = new ArrayProcessing();
        Scanner key = new Scanner(System.in);
        System.out.println("Masukkan banyak data (n): ");
        int n = key.nextInt();
        int dataBil[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Masukkan bil ke-"+(i+1)+": ");
            dataBil[i] = key.nextInt();
        }
        
        System.out.println(Arrays.toString(dataBil));
        System.out.println("Nilai Max: " + arr.cariMax(dataBil));
        System.out.println("Nilai Min: " + arr.cariMin(dataBil));
        System.out.println("Nilai Min: " + Arrays.toString(ArrayProcessing.urutkan(dataBil)));
        
    }
    
}

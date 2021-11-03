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
public class hitungRerata {
    // array
    int[] dataBil = new int[100];
    // jumlah data
    int n;
    minimum min = new minimum();
    
    void input(){
        Scanner key = new Scanner(System.in);
        System.out.println("Masukkan banyak data (n): ");
        this.n = key.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Masukkan bil ke-"+(i+1)+": ");
            this.dataBil[i] = key.nextInt();
        }
    }
    
    double rata2(int[] data){
        double sum = 0;
        for(int i = 0; i < this.n; i++){
            sum += data[i];
        }
        double hasil = sum/this.n;
        return hasil;
    }
    
    int cariMin(int[] data){
        //int min = Arrays.stream(data).min().getAsInt();
        //return min;
        
        int x = data[0];
        for(int i = 0; i < data.length; i++){
            if(data[i] < x){
                x = data[i];
            }
        }
        return x;
    }
    
    int cariMax(int[] data){
        int max = Arrays.stream(data).max().getAsInt();
        return max;
    }
    
    void output(){
        System.out.println("Rerata: " + this.rata2(this.dataBil));
        System.out.println("Nilan Max: " + this.cariMax(this.dataBil));
        System.out.println("Nilan Min: " + this.cariMin(this.dataBil));
    }
}

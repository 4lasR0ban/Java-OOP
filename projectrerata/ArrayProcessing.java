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
import java.util.Arrays;
public class ArrayProcessing {
    int n;
    
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
    
    static int[] urutkan(int[] data){
        int[] copy = Arrays.copyOf(data, data.length);
        int res = copy.length;
        for(int i = 0; i < res; i++){
            for(int j = i + 1; j < res; j++){
                if(copy[i] > copy[j]){
                    int temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;
                }
            }
        }
        return copy;
    }
    
}

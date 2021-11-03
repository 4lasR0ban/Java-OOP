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
public class minimum {
    int cariMin(int[] data){
        int min = Arrays.stream(data).min().getAsInt();
        return min;
    }
}

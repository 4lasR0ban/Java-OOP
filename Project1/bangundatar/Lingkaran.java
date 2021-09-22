/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author verow
 */
public class Lingkaran {
    // atribut
    int r;
    double pi = 3.14;
    
    // methods
    public void luasLingkaran(){
        double hasil = pi * r * r;
        System.out.println("Luas Lingkaran: " + hasil);
    }
    
    public void KelilingLingkaran(){
        double hasil = 2 * pi * r;
        System.out.println("Keliling Lingkaran: " + hasil);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author verow
 */
public class Bola {
    // atribut
    int jari;
    double pi = 3.14;
    
    //methods
    public void volumeBola(){
        double hasil = 4/3 * pi * jari * jari * jari;
        System.out.println("Volume Bola: " + hasil);
    }
    
    public void luasPermukaanBola(){
        double hasil = 4 * pi * jari * jari;
        System.out.println("Luas Permukaan Bola: " + hasil);
    }
}

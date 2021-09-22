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
public class PersegiPanjang {
    // atribut
    int panjang;
    int lebar;
    
    // methods
    public void luasPerPan(){
        int hasil = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + hasil);
    }
    public void kelilingPerPan(){
        int hasil = 2*(panjang + lebar);
        System.out.println("Keliling Persegi Panjang: " + hasil);
    }
}

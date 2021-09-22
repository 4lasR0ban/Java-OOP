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
public class Persegi {
    // atribut
    int sisi;
    
    // methods
    public void luasPersegi(){
        int hasil = sisi * sisi;
        System.out.println("Luas Persegi: " + hasil);
    }
    
    public void kelilingPersegi(){
        int hasil = 4 * sisi;
        System.out.println("Keliling Persegi: " + hasil);
    }
}

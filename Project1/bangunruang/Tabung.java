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
public class Tabung {
    // atribut
    int jari;
    int tinggi;
    double pi = 3.14;
    // methods
    public void volumeTabung(){
        double hasil = pi * jari * jari * tinggi;
        System.out.println("Voulme Tabung: " + hasil);
    }
    
    public void luasSelimutTabung(){
        double hasil = 2 * pi * jari * tinggi;
        System.out.println("Luas Selimut Tabung: " + hasil);
    }
}

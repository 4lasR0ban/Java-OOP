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
public class Kerucut {
    // atribut
    int jari;
    double pi = 3.14;
    int tinggi;
    int selimut;
    // methods
    public void volumeKerucut(){
        double hasil =  (pi * jari * jari * tinggi)/3;
        System.out.println("Volume Kerucut: " + hasil);
    }
    
    public void luasSelimutKerucut(){
        double hasil = pi * jari * selimut;
        System.out.println("Luas Selimut Kerucut: " + hasil);
    }
}

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
public class BangunRuangMain {
    public static void main(String[] args){
        // Bola
        Bola A = new Bola();
        A.jari = 4;
        A.volumeBola();
        A.luasPermukaanBola();
        
        // Tabung
        Tabung B = new Tabung();
        B.jari = 4;
        B.tinggi = 7;
        B.volumeTabung();
        B.luasSelimutTabung();
        
        // Kerucut
        Kerucut C = new Kerucut();
        C.jari = 4;
        C.selimut = 10;
        C.tinggi = 7;
        C.volumeKerucut();
        C.luasSelimutKerucut();
    }
}

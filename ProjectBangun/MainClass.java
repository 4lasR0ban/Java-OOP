
import bangundatar.Persegi;
import bangundatar.Lingkaran;
import bangunruang.Tabung;
import bangunruang.Balok;
import bangunruang.Bola;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author verow
 */
public class MainClass {
    public static void main(String[] args){
        Persegi p1 = new Persegi();
        Lingkaran l1 = new Lingkaran();
        Tabung t1 = new Tabung();
        Balok ba1 = new Balok();
        Bola bo1 = new Bola();
        
        // Bangun datar - Persegi
        p1.hitungLuas();
        p1.hitungKeliling();
        System.out.println("Persegi");
        p1.tampilHasil();
        System.out.println("----------------------------");
        
        // Bangun datar - Lingkaran
        l1.hitungLuas();
        l1.hitungKeliling();
        System.out.println("Lingkaran");
        l1.tampilHasil();
        System.out.println("----------------------------");
        
        // Bangun Ruang - Tabung
        t1.hitungLuasPermukaan();
        t1.hitungVolume();
        System.out.println("Tabung");
        t1.tampilHasil();
        System.out.println("----------------------------");
        
        // Bangun Ruang - Balok
        ba1.hitungLuasPermukaan();
        ba1.hitungVolume();
        System.out.println("Balok");
        ba1.tampilHasil();
        System.out.println("----------------------------");
    
        // Bangun Ruang - Bola
        bo1.hitungLuasPermukaan();
        bo1.hitungVolume();
        System.out.println("Bola");
        bo1.tampilHasil();
        System.out.println("----------------------------");
    }
}

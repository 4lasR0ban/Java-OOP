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
public abstract class BangunRuang {
    public abstract double hitungLuasPermukaan();
    public abstract double hitungVolume();
    public void tampilHasil(){
        System.out.println("Luas Permukaan: " + hitungLuasPermukaan());
        System.out.println("Volume: " + hitungVolume());
    }
}

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
public class Bola extends BangunRuang{
    public double r = 7;
    
    @Override
    public double hitungLuasPermukaan() {
        double luas = 4 * 3.14 * this.r * this.r;
        return luas;
    }

    @Override
    public double hitungVolume() {
        double volume = 4/3 * 3.14 * this.r * this.r * this.r;
        return volume;
    }
    
    @Override
    public void tampilHasil(){
        System.out.println("Luas Permukaan: " + this.hitungLuasPermukaan());
        System.out.println("Volume: " + this.hitungVolume());
    }
    
}

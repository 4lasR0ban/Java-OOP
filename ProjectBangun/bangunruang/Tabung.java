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
public class Tabung extends BangunRuang{
    public double r = 7;
    public double tinggi = 10;

    @Override
    public double hitungLuasPermukaan() {
        double luas = 2 * 3.14 * this.r * (this.r + this.tinggi);
        return luas;
    }

    @Override
    public double hitungVolume() {
        double volume = 3.14 * this.r * this.r * this.tinggi;
        return volume;
    }
    
    @Override
    public void tampilHasil(){
        System.out.println("Luas Permukaan: " + this.hitungLuasPermukaan());
        System.out.println("Volume: " + this.hitungVolume());
    }
 
}

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
public class Balok extends BangunRuang{
    public double panjang = 3;
    public double lebar = 4;
    public double tinggi = 5;
    
    @Override
    public double hitungLuasPermukaan() {
        double luas = 2 * (this.panjang * this.lebar +
                this.panjang * this.tinggi + this.tinggi * this.lebar);
        return luas;
    }

    @Override
    public double hitungVolume() {
        double volume = this.panjang * this.lebar * this.tinggi;
        return volume;
    }
    
    @Override
    public void tampilHasil(){
        System.out.println("Luas Permukaan: " + this.hitungLuasPermukaan());
        System.out.println("Volume: " + this.hitungVolume());
    }
    
}

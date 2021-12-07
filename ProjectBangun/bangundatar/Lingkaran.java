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
public class Lingkaran extends BangunDatar{
    public double r = 7;
    
    @Override
    public double hitungLuas(){
        double luas = 3.14 * this.r * this.r;
        return luas;
    }
    
    @Override
    public double hitungKeliling(){
        double keliling = 2 * 3.14 * this.r;
        return keliling;
    }
    
    @Override
    public void tampilHasil(){
        System.out.println("Luas: " + this.hitungLuas());
        System.out.println("Keliling: " + this.hitungKeliling());
    }
}

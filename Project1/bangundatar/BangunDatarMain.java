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
public class BangunDatarMain {
    public static void main(String[] args){
        PersegiPanjang op1 = new PersegiPanjang();
        Persegi A = new Persegi();
        Persegi B = new Persegi();
        Lingkaran X = new Lingkaran();
        Lingkaran Y = new Lingkaran();
        op1.lebar = 38;
        op1.panjang = 25;
        A.sisi = 10;
        B.sisi = 15;
        X.r = 25;
        Y.r = 37;
        op1.luasPerPan();
        op1.kelilingPerPan();
        A.luasPersegi();
        A.kelilingPersegi();
        B.luasPersegi();
        B.kelilingPersegi();
        X.luasLingkaran();
        X.KelilingLingkaran();
        Y.luasLingkaran();
        Y.KelilingLingkaran();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuasBangunKompleks;

/**
 *
 * @author verow
 */
public class project2 {
    public static void main(String[] args){
        // objek persegi
        Persegi A = new Persegi();
        
        // objek 1/2 lingkaran
        Lingkaran B = new Lingkaran();
        
        // objek 1/4 lingkaran
        Lingkaran C = new Lingkaran();
        
        // luas total persegi 
        double luasTotalPersegi = A.hitungLuas(14) * 2;
        //System.out.println("Luas total yang persegi: " + luasTotalPersegi);
        // luas total 1/2 lingkaran
        double luasTotalLingkaran = B.hitungLuas(14) * 22/7;
        //System.out.println("Luas total yang lingkarankecil: " + luasTotalLingkaran);
        double luasLingkaranBesar = 0.5 *(C.hitungLuas(28) * 22/7);
        //System.out.println("Luas total yang lingkaranbesar: " + luasLingkaranBesar);
        // luas total yang diarsir
        double luasTotal = luasTotalPersegi + luasTotalLingkaran - luasLingkaranBesar;
        System.out.println("Luas total yang diarsir: " + luasTotal);
    }
}

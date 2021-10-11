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
public class project1 {
    public static void main(String[] args){
        // PROJECT 1
        // objek 1/2 lingkaran 
        Lingkaran A = new Lingkaran();
        
        // objek persegi
        Persegi B = new Persegi();
        //System.out.println("Luas: " + B.hitungLuas(42));
        // hitung luas total lingkaran
        double luasTotalLingkaran = 2 * (A.hitungLuas(42) * 22/7);
        //System.out.println("Luas: " + luasTotalLingkaran);
        // hitung luas total
        double luasTotal = luasTotalLingkaran + B.hitungLuas(42);
        System.out.println("Luas total: " + luasTotal);
    }
}

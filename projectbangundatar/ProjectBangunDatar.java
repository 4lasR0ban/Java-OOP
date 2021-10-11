/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar;

/**
 *
 * @author verow
 */
public class ProjectBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Luas & Keliling Persegi Panjang
        PersegiPanjang a = new PersegiPanjang();
        System.out.println("1. Luas & Keliling Persegi Panjang: "
        + "\nLuas1 = " + a.hitungLuas(10, 5) + ", Keliling1 = " + a.hitungKeliling(10, 5)
        + "\nLuas2 = " + a.hitungLuas(3.6, 8) + ", Keliling2 = " + a.hitungKeliling(3.6, 8)
        + "\nLuas3 = " + String.format("%.2f", a.hitungLuas(6, 8.3)) + ", Keliling3 = " + a.hitungKeliling(6, 8.3)
        + "\nLuas4 = " + a.hitungLuas(5.6, 8.8) + ", Keliling4 = " + a.hitungKeliling(5.6, 8.8)
        );
        
        // Luas & Keliling Persegi
        Persegi b = new Persegi();
        System.out.println("2. Luas & Keliling Persegi: "
        + "\nLuasP1 = " + b.hitungLuas(4.5) + ", Keliling1 = " + b.hitungKeliling(4.5)
        + "\nLuasP2 = " + b.hitungLuas(7) + ", Keliling2 = " + b.hitungKeliling(7)
        );
        
        // Luas & Keliling Lingkaran
        Lingkaran c = new Lingkaran();
        System.out.println("3. Luas & Keliling Lingkaran: "
        + "\nLuasL1 = " + (c.hitungLuas(5) * 3.14) + ", Keliling1 = " + String.format("%.2f", c.hitungKeliling(5) * 3.14)
        + "\nLuasL2 = " +  String.format("%.2f", c.hitungLuas(7.4) * 3.14) + ", Keliling2 = " + String.format("%.2f", c.hitungKeliling(7.4) * 3.14)
        );
        
        // Luas & Keliling Segitiga 
        segitiga d = new segitiga();
        System.out.println("4. Luas & Keliling Segitiga: "
        + "\nLuasS1 = " + d.hitungLuas(8, 10) + ", Keliling1 = " + String.format("%.2f", d.hitungKeliling(8, 10))
        + "\nLuasS2 = " + d.hitungLuas(8, 11.5) + ", Keliling2 = " + String.format("%.2f", d.hitungKeliling(8, 11.5))
        + "\nLuasS3 = " + d.hitungLuas(12.2, 9) + ", Keliling3 = " + String.format("%.2f", d.hitungKeliling(12.2, 9))
        + "\nLuasS4 = " + String.format("%.2f", d.hitungLuas(13.9, 20.7)) + ", Keliling4 = " + String.format("%.2f", d.hitungKeliling(13.9, 20.7))
        );
    }
    
}

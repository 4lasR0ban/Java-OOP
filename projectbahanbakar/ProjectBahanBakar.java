/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbahanbakar;
/**
 *
 * @author verow
 */
public class ProjectBahanBakar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        SUV suv = new SUV();
        MPV mpv = new MPV();
        
        System.out.println("Mobil A - Sedan:");
        double Abb = sedan.hitungBahanBakar(157.6);
        double Aw = sedan.hitungWaktu(60, 157.6);
        System.out.println("waktu yang dibutuhkan (Solo-Kudus): " + 
                String.format("%.2f", Aw) + " Jam");
        System.out.println("Bahan bakar minimal (Solo-Kudus): " + 
                Math.ceil(Abb) + " liter");
        System.out.println("========================================");
        
        System.out.println("Mobil B - Sedan:");
        double Bbb = sedan.hitungBahanBakar(536.4);
        double Bw = sedan.hitungWaktu(65, 536.4);
        System.out.println("waktu yang dibutuhkan (Solo-Jakarta): " + 
                String.format("%.2f", Bw) + " Jam");
        System.out.println("Bahan bakar minimal (Solo-Jakarta): " + 
                Math.ceil(Bbb) + " liter");
        System.out.println("========================================");
        
        System.out.println("Mobil C - SUV:");
        double Cbb = suv.hitungBahanBakar(660.8);
        double Cw = suv.hitungWaktu(57, 660.8);
        System.out.println("waktu yang dibutuhkan (Solo-Banten): " + 
                String.format("%.2f", Cw) + " Jam");
        System.out.println("Bahan bakar minimal (Solo-Banten): " + 
                Math.ceil(Cbb) + " liter");
        System.out.println("========================================");
        
        System.out.println("Mobil D - SUV:");
        double Dbb = suv.hitungBahanBakar(532.8);
        double Dw = suv.hitungWaktu(62, 532.8);
        System.out.println("waktu yang dibutuhkan (Solo-Bandung): " + 
                String.format("%.2f", Dw) + " Jam");
        System.out.println("Bahan bakar minimal (Solo-Bandung): " + 
                Math.ceil(Dbb) + " liter");
        System.out.println("========================================");
        
        System.out.println("Mobil E - MPV:");
        double Ebb = mpv.hitungBahanBakar(539.4);
        double Ew = mpv.hitungWaktu(64, 539.4);
        System.out.println("waktu yang dibutuhkan (Solo-Banten): " + 
                String.format("%.2f", Ew) + " Jam");
        System.out.println("Bahan bakar minimal (Solo-Banten): " + 
                Math.ceil(Ebb) + " liter");
        System.out.println("========================================");
        
        System.out.println("Mobil F - MPV:");
        double Fbb = mpv.hitungBahanBakar(431.1);
        double Fw = mpv.hitungWaktu(53, 431.1);
        System.out.println("waktu yang dibutuhkan (Solo-Banten): " + 
                String.format("%.2f", Fw) + " Jam");
        System.out.println("Bahan bakar minimal (Solo-Banten): " + 
                Math.ceil(Fbb) + " liter");
        System.out.println("========================================");
    }
    
}

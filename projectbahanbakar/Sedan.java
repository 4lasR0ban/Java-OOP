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
public class Sedan extends Mobil{
    public double konsumsi = 10;
    @Override
    public double hitungBahanBakar(double jarak) {
        double bb = jarak / this.konsumsi;
        return bb;
    }

    @Override
    public double hitungWaktu(int kecepatan, double jarak) {
        double waktu = jarak / kecepatan;
        return waktu;
    }
    
}

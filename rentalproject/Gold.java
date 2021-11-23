/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalproject;

/**
 *
 * @author verow
 */
public class Gold extends Silver{
    int biaya = 30000;
    int cashback;
    double diskon = 0.02;
     
    @Override
    protected void benefit1(long lama){
        double biayaSewa = biaya * lama; 
        double total = biayaSewa - (biayaSewa * diskon);
        System.out.println("Total Sewa: " + total);
    }
    
    @Override
    protected void benefit2(long lama){
        poin = 5 * lama;
        System.out.println("Jumlah Poin: " + poin);
    }
    
    protected void benefit3(){
        cashback = 5000;
        System.out.println("Jumlah CashBack: " + cashback);
    }
}

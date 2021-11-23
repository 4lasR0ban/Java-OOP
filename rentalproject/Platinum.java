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
public class Platinum extends Gold{
    int biaya = 45000;
    long pulsa;
    double diskon = 0.03;
    
    @Override
    protected void benefit1(long lama){
        double biayaSewa = biaya * lama; 
        double total = biayaSewa - (biayaSewa * diskon);
        System.out.println("Total Sewa: " + total);
    }
    
    @Override
    protected void benefit2(long lama){
        poin = 10 * lama;
        System.out.println("Jumlah Poin: " + poin);
    }
    
    @Override
    protected void benefit3(){
        cashback = 10000;
        System.out.println("Jumlah CashBack: " + cashback);

    }
    
    protected void benefit4(long lama){
        pulsa = 5000 * lama;
        System.out.println("Bonus Pulsa: " + pulsa);
    }
}

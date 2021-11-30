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
    private int biaya;
    long pulsa;
    double diskon = 0.03;
    int cashback = 10000;
    
    // setter
    @Override
    public void setBiaya(int biaya){
        if(biaya > 0){
            this.biaya = biaya;
        } else {
            this.biaya = 0;
        }
    }
    
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
    
    // getter
    @Override
    public int getCashback(){
        return this.cashback;
    }
    
    protected void benefit4(long lama){
        pulsa = 5000 * lama;
        System.out.println("Bonus Pulsa: " + pulsa);
    }
}

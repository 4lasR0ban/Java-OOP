/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpendataankaryawan;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author verow
 */
public class DataKaryawan{
    ArrayList<Karyawan> dataKaryawan = new ArrayList<Karyawan>();
    Scanner key = new Scanner(System.in);
    void tambahKaryawan(Karyawan data){
        this.dataKaryawan.add(data);
    }

    void tampilKaryawan(){
        for(Karyawan data: this.dataKaryawan){
            data.print();
        }
    }
    
    void cariData(int kode){
        boolean find = false;
        int index = -1;
        for(int i = 0; i < this.dataKaryawan.size(); i++){
            if(this.dataKaryawan.get(i).kodeKaryawan == kode){
                index = i;
                find = true;
            }
        }
        
        if(find == true){
            this.dataKaryawan.get(index).cari();
        } else{
            System.out.println("Data Karyawan tidak ditemukan");
        }
    }
    
    void hapusData(int kode){
        this.dataKaryawan.removeIf(data -> data.kodeKaryawan == kode);
    }
    
    public int jumlahKaryawan(){
        return dataKaryawan.size();
    }
}

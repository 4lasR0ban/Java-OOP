/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalproject;

import java.util.ArrayList;

/**
 *
 * @author verow
 */
public class DataMember {
    ArrayList<member> dataMember = new ArrayList<member>();
    
    void tambahMember(member data){
        this.dataMember.add(data);
    }
    void cariMember(String id){
        boolean find = false;
        int index = -1;
        for(int i = 0; i < this.dataMember.size(); i++){
            if(this.dataMember.get(i).idMember.equals(id)){
                index = i;
                find = true;
            }
        }
        
        if(find == true){
            this.dataMember.get(index).print();
        } else {
            System.out.println("Data Member tidak ditemukan!");
            System.exit(0);
        }
    }
}

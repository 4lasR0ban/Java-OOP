/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author verow
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operasi a = new Operasi();
        System.out.println(a.jumlahkan(3, 4));
        
        Operasi b = new Operasi();
        System.out.println(b.jumlahkan(4, 7, -9));
        
        Operasi c = new Operasi();
        System.out.println(c.jumlahkan(3.4, -0.002, 0.12313));
        
        // PROJECT 1
        Operasi d = new Operasi();
        System.out.println(d.kalikan(4, 4.5, 5.0));
    }
    
}

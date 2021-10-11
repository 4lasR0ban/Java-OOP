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
public class segitiga {
    // Hitung Luas
    int hitungLuas(int a, int b){
        return (a * b)/2;
    }
    
    double hitungLuas(int a, double b){
        return (a * b)/2;
    }
    
    double hitungLuas(double a, int b){
        return (a * b)/2;
    }
    
    double hitungLuas(double a, double b){
        return (a * b)/2;
    }
    
    
    // Hitung Keliling
    double hitungKeliling(int a, int b){
        // garis miring
        double m = ((a * a) + (b * b));
        double Keliling = a + b + (Math.sqrt(m));
        return Keliling;
    }
    
    double hitungKeliling(int a, double b){
        // garis miring
        double m = ((a * a) + (b * b));
        double Keliling = a + b + (Math.sqrt(m));
        return Keliling;
    }
    
    double hitungKeliling(double a, int b){
       // garis miring
        double m = ((a * a) + (b * b));
        double Keliling = a + b + (Math.sqrt(m));
        return Keliling;
    }
    
    double hitungKeliling(double a, double b){
        // garis miring
        double m = ((a * a) + (b * b));
        double Keliling = a + b + (Math.sqrt(m));
        return Keliling;
    }
}

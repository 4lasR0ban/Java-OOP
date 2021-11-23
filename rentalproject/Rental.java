/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalproject;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/**
 *
 * @author verow
 */

public class Rental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // attribut
       String id;
       
       // object
       waktu time = new waktu();
       DataMember data = new DataMember();
       Scanner key = new Scanner(System.in);
       DateTimeFormatter dtf = DateTimeFormatter.BASIC_ISO_DATE;
       
       // array list
       data.tambahMember(new member("M001", "Vero", "Silver"));
       data.tambahMember(new member("M002", "Bagus", "Gold"));
       data.tambahMember(new member("M003", "Wardana", "Platinum"));
       
       // input
       System.out.print("Masukkan ID Member: ");
       id = key.nextLine();
       time.pinjam();
       time.kembali();
       
       System.out.println("============================");
       
       // output
       data.cariMember(id.toUpperCase());
       
       LocalDate pinjam = LocalDate.of(time.thnPinjam, time.blnPinjam, 
                           time.tglPinjam);
       String pFormat = pinjam.format(dtf);
       LocalDate parsedPinjam = LocalDate.parse(pFormat, dtf);
       
       LocalDate kembali = LocalDate.of(time.thnKembali, time.blnKembali, 
                            time.tglKembali);
       String kFormat = kembali.format(dtf);
       LocalDate parsedKembali = LocalDate.parse(kFormat, dtf);
       
       long lama = ChronoUnit.DAYS.between(pinjam, kembali);
     
       System.out.println("Tanggal Pinjam: " + parsedPinjam);
       System.out.println("Tanggal Kembali: " + parsedKembali);
       System.out.println("Lama Sewa: " + lama + " hari");
       System.out.println("============================");

        int index = -1;
        for(int i = 0; i < data.dataMember.size(); i++){
            if(data.dataMember.get(i).idMember.equals(id.toUpperCase())){
                index = i;
                switch (data.dataMember.get(i).jenisMember) {
                    case "Silver":
                        Silver silver = new Silver();
                        silver.benefit1(lama);
                        silver.benefit2(lama);
                        break;
                    case "Gold":
                        Gold gold = new Gold();
                        gold.benefit1(lama);
                        gold.benefit2(lama);
                        gold.benefit3();
                        break;
                    case "Platinum":
                        Platinum plat = new Platinum();
                        plat.benefit1(lama);
                        plat.benefit2(lama);
                        plat.benefit3();
                        plat.benefit4(lama);
                        break;
                    default:
                        System.out.println("GAGAL");
                        break;
                }
            } 
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119043.ferminaufalakbar.no1;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program mencari kepribadian berdasarkan umur
 */
public class UTSIF210119043FERMINAUFALAKBARNo1 {

    /**
     * @param args the command line arguments
     */
    public static int yearNow;
    public static final String RED = "\u001b[31m";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat now = new SimpleDateFormat("yyyy");
        String tahun = now.format(cal.getTime());
        int year = Integer.parseInt(tahun);
        yearNow = year;
        Age age = new Age(yearNow);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Tahun Lahir Anda : ");
        int tahunLahir = scanner.nextInt();
        age.setYearBirth(tahunLahir);
        
        System.out.println();
        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+ age.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu : " + RED +age.tandanyaKamu(age.hitungUmur()));
    }
    
}

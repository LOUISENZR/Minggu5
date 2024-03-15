package Minggu5;
import java.util.Scanner;

import Minggu5.pangkat;
public class mainPangkat {

    public static void main(String[] args) {
        Scanner sc16 = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.print("Masukan Jumlah Elemen yang Ingin Dihitung : ");
        int elemen = sc16.nextInt();

        pangkat[] png = new pangkat[elemen];
        for (int i = 0; i< elemen; i++){
            png[i] = new pangkat();
            System.out.print("Masukan Nilai Yang Akan Dipangkatkan ke-"+(i+1)+ " : ");
            png[i].nilai = sc16.nextInt();
            System.out.print("Masukan Nilai Pemangkat ke-"+ (i+1)+" : ");
            png[i].pangkat = sc16.nextInt();
        } 
        System.out.println("==============================================");
        System.out.print("Hasil Pangkat Dengan Brute Force");
        for (int i=0; i<elemen; i++){
            System.out.println("Nilai"+png[i].nilai+" Panggkat "+png[i].pangkat+" Adalah : "+png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        } 
        System.out.println("==============================================");
        System.out.print("Hasil Pangkat Dengan Devide and Conquer");
        for (int i=0; i<elemen; i++){
            System.out.println("Nilai"+png[i].nilai+" Panggkat "+png[i].pangkat+" Adalah : "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        } 
        System.out.println("==============================================");
 
    }
    
}

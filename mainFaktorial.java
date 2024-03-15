package Pertemuan5;
import java.util.Scanner;
public class mainFaktorial {
public static void main(String[] args) {
    Scanner sc16 = new Scanner (System.in);
    System.out.println("=========================================");
    System.out.print("Masukan Elemen Yang Akan Dihitung : ");
    int elemen = sc16.nextInt();

    faktorial[] fk = new faktorial[elemen];
    for (int i=0; i< elemen; i++){
        fk[i] = new faktorial();
        System.out.print("Masukan Nilai Data ke-" +(i+1)+" : ");
        fk [i].nilai= sc16.nextInt(); 
    }
    System.out.println("==========================================");
    System.out.println("Hasil Faktorial Dengan Brute Force");
    for (int i = 0; i< elemen; i++){
        System.out.println("Faktorial Dari Nilai "+ fk[i].nilai+" adalah "+ fk[i].faktorialBF(fk[i].nilai));
    }
    System.out.println("==========================================");
    System.out.println("Hasil Faktorial Dengan Brute Force");
    for (int i = 0; i< elemen; i++){
        System.out.println("Faktorial Dari Nilai "+ fk[i].nilai+" adalah "+ fk[i].faktorialDC(fk[i].nilai));
    }
    System.out.println("==========================================");
}    
}

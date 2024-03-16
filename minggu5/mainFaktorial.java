package minggu5;
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
    long start1 = 0, end1 = 0;
    start1 = System.nanoTime();
    for (int i = 0; i< elemen; i++){
        System.out.println("Faktorial Dari Nilai "+ fk[i].nilai+" adalah "+ fk[i].faktorialBF(fk[i].nilai));
    }
    end1 = System.nanoTime();
    System.out.println("Waktu Durasi Brute Force : "+(end1-start1));
    System.out.println("==========================================");
    long start2 = 0, end2 = 0;
    start2 = System.nanoTime();
    System.out.println("Hasil Faktorial Dengan Brute Force");
    for (int i = 0; i< elemen; i++){
        System.out.println("Faktorial Dari Nilai "+ fk[i].nilai+" adalah "+ fk[i].faktorialDC(fk[i].nilai));
    }
    end2 = System.nanoTime();
    System.out.println("Waktu Durasi Devide and Conquer2 : "+(end2-start2));
    System.out.println("==========================================");
}    
}

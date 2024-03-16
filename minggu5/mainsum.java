package minggu5;
import java.util.Scanner;
public class mainsum {
    public static void main(String[] args) {
        Scanner sc16=new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.println("Masukan Jumlah Bulan : ");
        int elm = sc16.nextLine();
        sum sm = new sum(elm);
        System.out.println("============================================================");
        for (int i=0; i<sm.elemen; i++){
            System.out.println("Masukan Untunng Bulan ke- "+(i+1)+" = ");
            sm.keuntungan[i] = sc16.nextDouble();
        }
        System.out.println("============================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total Keuntungan Perusahaan selama "+ sm.elemen +" bulan adalah = "+sm.totalBF(sm.keuntungan));
        System.out.println("============================================================");
        System.out.println("Algoritma Devide and Conquere");
        System.out.println("Total Keuntungan Perusahaan selama "+ sm.elemen +" bulan adalah = "+sm.totalDC(sm.keuntungan, 0, sm.elemen-l));
    }

    
}

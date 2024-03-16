package minggu5;
import java.util.Scanner;

public class mainsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.print("Masukan Jumlah Perusahaan : ");
        int jumlahPerusahaan = scanner.nextInt();

        sum[] sm = new sum[jumlahPerusahaan];

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.print("Masukan jumlah bulan untuk perusahaan ke-" + (i + 1) + " : ");
            int jumlahBulan = scanner.nextInt();
            sm[i] = new sum(jumlahBulan);

            System.out.println("Masukkan keuntungan per bulan untuk perusahaan ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahBulan; j++) {
                System.out.print("Masukan untung bulan ke-" + (j + 1) + " : ");
                sm[i].keuntungan[j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < sm.length; i++) {
            System.out.println("\nPerusahaan ke-" + (i + 1));
            System.out.println("============================================================");
            System.out.println("Algoritma Brute Force");
            System.out.printf("Total Keuntungan Perusahaan selama %d bulan adalah %10.2f\n", 
                              sm[i].elemen, sm[i].totalBF(sm[i].keuntungan));
            System.out.println("============================================================");
            System.out.println("Algoritma Devide and Conquere");
            System.out.printf("Total Keuntungan Perusahaan selama %d bulan adalah %10.2f\n", 
                              sm[i].elemen, sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1));
            System.out.println("============================================================");
        }
    }
}

package minggu5;
import java.util.Scanner;
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
            int nilaiYgDhtung = sc16.nextInt();
            System.out.print("Masukan Nilai Pemangkat ke-"+ (i+1)+" : ");
            int nilaiPanngkat = sc16.nextInt();
            png[i] = new pangkat(nilaiYgDhtung, nilaiPanngkat);
        }
        
        System.out.println("====================Menu======================");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.println("Masukan Pilihan : ");
        int pilihan = sc16.nextInt();
        if (pilihan==1){
            System.out.println("==============================================");
            System.out.println("Hasil Pangkat Dengan Brute Force");
            for (int i=0; i<elemen; i++){
                System.out.println("Nilai"+png[i].nilai+" Panggkat "+png[i].pangkat+" Adalah : "+png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }    
        }else if (pilihan==2){
            System.out.println("==============================================");
            System.out.println("Hasil Pangkat Dengan Devide and Conquer");
            for (int i=0; i<elemen; i++){
                System.out.println("Nilai"+png[i].nilai+" Panggkat "+png[i].pangkat+" Adalah : "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }   
        }else{
            System.out.println("==============================================");
        }
 
    }
    
}

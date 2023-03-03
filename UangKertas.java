import java.util.Scanner;
/**
 *
 * @author 4715
 */
public class UangKertas {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        //input jumlah uang dari keyboard
        System.out.print("Masukan Jumlah Uang : ");
        double jumlah = input.nextDouble();
 
 
        int ratusRibu = (int)(jumlah / 100000);
        int sisa = (int)(jumlah % 100000);

        int limapuluhRibu = sisa / 50000;
        int sisa2 = (int)(jumlah % 50000);
        
        int duapuluhRibu = sisa2 / 20000;
        int sisa3 = (int)(jumlah % 20000);
    
        int sepuluhribuan = (sisa3 / 10000);
        int sisa4 = (int)(jumlah % 10000);
        
        int limaribuan = (sisa4 / 5000);
        int sisa5 = (int)(jumlah % 5000);
        
        int duaribuan = (sisa5 / 2000);
        int sisa6 = (int)(jumlah % 2000);
        
        int seribuan = (sisa6 / 1000);
        int sisa7 = (int)(jumlah % 1000);
        
        int limaratusan = (sisa7 / 500);
        int sisa8 = (int)(jumlah % 500);
        
        int seratusan = sisa8 / 100;
        int sisa9 = (int)(jumlah % 100);
        
        if (sisa9 !=0){
            System.out.println("Jumlah Uang harus kelipatan 100");
        }else{
        //cetak hasil
        System.out.println("Jumlah Uang = " + jumlah);
        System.out.println("Jumlah Uang 100.000 sebanyak = " + ratusRibu + " Lembar");
        System.out.println("Jumlah Uang 50.000  sebanyak = " + limapuluhRibu + " Lembar");
        System.out.println("Jumlah Uang 20.000  sebanyak = " + duapuluhRibu + " Lembar");
        System.out.println("Jumlah Uang 10.000  sebanyak = " + sepuluhribuan + " Lembar");
        System.out.println("Jumlah Uang 5.000   sebanyak = " + limaribuan + " Lembar");
        System.out.println("Jumlah Uang 2.000   sebanyak = " + duaribuan + " Lembar");
        System.out.println("Jumlah Uang 1.000   sebanyak = " + seribuan + " Lembar");
        System.out.println("Jumlah Uang 500     sebanyak = " + limaratusan + " Keping");
        System.out.println("Jumlah Uang 100     sebanyak = " + seratusan + " Keping");
        }
    }
}

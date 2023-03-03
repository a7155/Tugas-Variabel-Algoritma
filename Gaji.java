import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
/**
 *
 * @author 4715
 */
public class Gaji {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

            String nama;
            int jum, gol, jkerja, jlembur, gapok, glembur;
            double pajakgapok, pajaklembur, totpajak,gajibersih;

            System.out.println("-------------------------------------------------");
            System.out.println("        PROGRAM MENGHITUNG GAJI KARYAWAN         ");
            System.out.println("-------------------------------------------------");

            System.out.print("Masukan Nama : ");
            nama=input.next();
            System.out.print("Masukan Golongan : ");
            gol=input.nextInt();
            System.out.print("Masukan Jam Kerja : ");
            jkerja=input.nextInt();

            switch(gol){
                case 1 : 
                        gapok=1486500;
                        break;
                case 2 :
                        gapok=1926000;
                        break;
                case 3 :
                        gapok=2456700;
                        break;
                case 4 :
                        gapok=2899500;
                        break;
                default :
                        gapok=0;
            }

            if (jkerja>173){
                jlembur=jkerja-173;	
            }else{
                 jlembur=0;
            }

            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');
            kursIndonesia.setDecimalFormatSymbols(formatRp);

            glembur=jlembur*50000;
            gajibersih=gapok+glembur;

            System.out.println("Nama                 : "+nama);
            System.out.println("Gaji Pokok           : "+kursIndonesia.format(gapok));
            System.out.println("Gaji Lembur          : "+kursIndonesia.format(glembur));
            System.out.println("Gaji Diterima        : "+kursIndonesia.format(gajibersih));
  }  
}

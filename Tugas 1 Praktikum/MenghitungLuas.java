import java.util.Scanner;
public class MenghitungLuas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = input.nextInt();
        if (menu == 1){
            double sisi = input.nextInt();
            System.out.println(persegi(sisi));
        }
        else if (menu == 2){
            double alas = input.nextDouble();
            double tinggi = input.nextDouble();
            System.out.println(segitiga(alas, tinggi));
        }
        else if (menu== 3){
            double jari = input.nextDouble();
            if (jari%7 == 0){
                System.out.println(lingkaran(jari));
            }
            else 
             System.out.println(lingkaran2(jari));
        }
        else System.out.println("Input yang anda masukan tidak sesuai");
    }
    public static int persegi(double psisi){
        int hasil =  (int)(psisi*psisi);
        return hasil;
    }
    public static int segitiga(Double palas, Double ptinggi){
        int hasil = (int) ((palas*ptinggi)/2);
        return hasil;
    }
    public static double lingkaran(double pjari){
        double hasil = 22 / 7 * pjari * pjari;
        return hasil;
    }
    public static double lingkaran2(double pjari){
        double hasil = 3.14 * pjari* pjari;
        int result = (int) hasil;
        return result;
    }
}

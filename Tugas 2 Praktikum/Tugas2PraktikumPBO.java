package tugas.pkg2.praktikum.pbo;
import java.util.*;
public class Tugas2PraktikumPBO {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = input.nextInt();
        switch (menu){
            case 1:
                Persegi persegi = new Persegi(input.nextInt());
                persegi.luasPersegi();
                break;

            case 2:
                Segitiga segitiga = new Segitiga(input.nextDouble(),input.nextDouble());
                segitiga.luasSegitiga();
                break;

            case 3:
                double jarijari = input.nextDouble();
                Lingkaran lingkaran = new Lingkaran(jarijari);
                if(jarijari % 7 == 0){
                    lingkaran.LuasLingkaran1();
                }
                else{
                    lingkaran.LuasLingkaran2();
                }
                break;
            default: System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
    
}
class Persegi {
    int sisi;
    public Persegi(int sisi){
        this.sisi = sisi;
    }
    public int luasPersegi(){
        int result = sisi*sisi;
        System.out.println(result);
        return result;
    }
}
class Segitiga {
    double alas,tinggi;

    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public int luasSegitiga(){
        double luas = (alas*tinggi)/2;
        int result =(int)luas;
        System.out.println(result);
        return result;
    }
}
class Lingkaran {
    double jarijari;
    
    public Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }
    public double LuasLingkaran1(){
        double result = (int)(22/7*jarijari*jarijari);
        System.out.println(result);
        return result;
    }
    public int LuasLingkaran2(){
        double luas = 3.14*jarijari*jarijari;
        int result = (int)luas;
        System.out.println(result);
        return result;
    }
}

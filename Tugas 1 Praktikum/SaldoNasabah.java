import java.util.Scanner;
public class SaldoNasabah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo = input.nextInt();
        int setoran = input.nextInt();
        System.out.println(hasil(saldo,setoran));
    }
    public static double hasil(int saldo, int setor){
        double total = saldo+setor;
        total = total - 7000;
        double bonus = 5*total/10000;
        double total2 = total + bonus;
        return total2;
    }
}

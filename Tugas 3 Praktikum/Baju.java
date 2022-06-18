/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baju;
import java.util.Scanner;
/**
 *
 * @author BISMILLAH NAWAITU
 */

class Baju2 {

    /**
     * @param args the command line arguments
     */
    String jenis;
    int harga;
    int jumlah;
    
    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;
    
    public Baju2 (String a,int b){
        this.jenis = a;
        this.jumlah = b;
    }
    
   
    void hargaa(){
        if (jumlah > 100){
            harga = 95000;
        } else harga = bajua;
    }
    void hargab(){
         if (jumlah > 100){
            harga = 120000;
        } else harga = bajub;
    }
    void hargac(){
         if (jumlah > 100){
            harga = 160000;
        } else harga = bajuc;
    }
    
    void display(){
        if (jenis.equalsIgnoreCase("a")) {
            hargaa();
        }
        else if (jenis.equalsIgnoreCase("b") ) {
            hargab();
        }
        else if(jenis.equalsIgnoreCase("c")){
            hargac();
        }
        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah       : " + harga);
        System.out.println("Total harga          : " + jumlah*harga);
    }  
    
}
public class Baju{
        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            Baju display = new Baju();
            System.out.println("Baju yang tersedia : ");
            System.out.println("Baju A dengan harga 100000");
            System.out.println("Baju B dengan harga 125000");
            System.out.println("Baju C dengan harga 175000");
            
            System.out.print("Baju yang akan anda beli bertipe : "); 
            String jenis = input.nextLine();
            System.out.print("Jumlah Baju yang akan anda beli adalah : ");
            int  jumlah = input.nextInt();
            
            Baju2 baju = new Baju2 (jenis,jumlah);
            baju.display();
        }
}
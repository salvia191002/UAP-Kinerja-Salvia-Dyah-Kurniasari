/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumarraylist;
import java.util.*;
/**
 *
 * @author BISMILLAH NAWAITU
 */
public class RentArchive {
    private ArrayList <CarRent> rentData = new ArrayList<CarRent>();
    
    public void Rent (CarRider rider, Car car, int rentDur){
        if(car.isStatus() == true){
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus(false);
            rentData.add(new CarRent(rider, car, rentDur));
        }
        else{
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }
    
    public void info(){
        System.out.println("-------------------------------------");
        System.out.println(" INFORMASI PELANGGAN                 ");
        System.out.println("-------------------------------------");
        
        for (int i = 0; i < rentData.size(); ++i) {
            System.out.println("NAMA PEMINJAM   : " + rentData.get(i).getRider().getName());
            System.out.println("TIPE MOBIL      : " + rentData.get(i).getCar().getCarType());   
            System.out.println("NO. POLISI      : " + rentData.get(i).getCar().getPolNum());
            System.out.println("LAMA RENTAL     : " + rentData.get(i).getRentDur());
            System.out.println("-------------------------------------");
        }
    }
}
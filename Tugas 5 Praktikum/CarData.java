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
public class CarData {
    ArrayList <Car> carList = new ArrayList<Car>();
    
    public void addCar(String carType, String polNum, String merk){
        carList.add(new Car(carType, polNum, merk, true));
    }
    
    public void listOfCar(){
        System.out.println("-------------------------------------");
        System.out.println("  DAFTAR MOBIL                       ");
        System.out.println("-------------------------------------");
        
        for(Car list : carList){
            System.out.println("TIPE MOBIL : " + list.getCarType());
            System.out.println("NO. POLISI : " + list.getPolNum());
            System.out.println("MERK MOBIL : " + list.getMerk());
            System.out.println("-------------------------------------");
        }
        System.out.println("");
    }
}

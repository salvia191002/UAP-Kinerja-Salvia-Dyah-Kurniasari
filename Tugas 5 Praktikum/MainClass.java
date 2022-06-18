package praktikumarraylist;
/**
 *
 * @author BISMILLAH NAWAITU
 */
public class MainClass {
    public static void main(String[] args){
    CarRider lisa = new CarRider("Lalisa Manoban", 25, "085132905600");
    CarRider jennie = new CarRider("Kim Jennie", 26, "087756573900");
    CarRider jisoo = new CarRider("Kim Jisoo", 27, "088346789008");
    CarRider rose = new CarRider("Rosseane Park", 25, "081904620987");
    
    CarData data = new CarData();
    data.addCar("SUV", "N 1111 AB", "Honda");
    data.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
    data.addCar("TRUCK", "N 3333 AB", "Suzuki");
    data.addCar("OFF ROAD", "N 4444 AB", "Jeep");
    
    data.listOfCar();
    
    RentArchive arsip = new RentArchive();
    arsip.Rent(lisa, data.carList.get(2), 3);
    arsip.Rent(jennie, data.carList.get(0), 2);
    arsip.Rent(jisoo, data.carList.get(2), 4);
    arsip.Rent(rose, data.carList.get(1), 6);
    
    System.out.println("");
    arsip.info();
    }
}

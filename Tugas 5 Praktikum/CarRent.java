/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumarraylist;

/**
 *
 * @author BISMILLAH NAWAITU
 */
public class CarRent{
    private CarRider rider;
    private Car car;
    private int rentDur;
    
    public CarRent(CarRider rider, Car car, int rentDur){
        this.rider = rider;
        this.car = car;
        this.rentDur = rentDur;
    }

    public CarRider getRider(){
        return rider;
    }

    public Car getCar(){
        return car;
    }

    public int getRentDur(){
        return rentDur;
    }
    
}

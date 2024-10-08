package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());

       car.accelerate();

        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        mitsubishi.startEngine();

        mitsubishi.accelerate();

        mitsubishi.brake();

        Car ford = new Ford(6, "Ford Falcon");

        ford.startEngine();

      ford.accelerate();

       ford.brake();

        Car holden = new Holden(6, "Holden Commodore");


        holden.startEngine();

      holden.accelerate();

       holden.brake();


        Car mitsubishi1 = new Mitsubishi(123,"Evo");
        Car ford1 = new Ford(121 ,"Mustang");
        Car holden1 =  new Holden(123,"model-x");



        GasPoweredCar gasCar = new GasPoweredCar("Gas Powered Car", "A car powered by gasoline", 12.5, 4);
        ElectricCar electricCar = new ElectricCar("Electric Car", "A car powered by electricity", 15.0, 75);




    }
}
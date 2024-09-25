package org.example.arge;

public class HybridCar extends CarSkeleton {

    private double avgKmPerLitre;
     private int cylinders;
    private int batterySize;


    public HybridCar(double avgKmPerLitre, int batterySize, int cylinders) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }




}

package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerLitre;

    private int batterySize;


    public ElectricCar(double avgKmPerLitre, int batterySize) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }
}

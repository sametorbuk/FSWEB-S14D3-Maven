package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;


    public ElectricCar(double avgKmPerCharge, int batterySize) {
        super("Electric Car", "A car powered by electricity");
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }


    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting electric engine");
        super.startEngine();
    }


    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}

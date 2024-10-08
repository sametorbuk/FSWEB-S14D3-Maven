package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;


    public CarSkeleton() {
        this.name = "Default Car";
        this.description = "Default Description";
    }


    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public void startEngine() {
        System.out.println(name + " engine is starting...");
        drive();
    }


    protected void runEngine() {
        System.out.println(name + " engine is running...");
    }


    public void drive() {
        System.out.println(name + " is driving...");
        runEngine();
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

package org.example.company;



public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private  int wheels;


    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels=4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }


    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

   public String startEngine(){
        getClass();
      return "engine is starting";
   }



    public String accelerate(){
        getClass();

     return "the car is accelerating";

   }

   public String brake(){
        getClass();
     return "the car is braking";
   }



}

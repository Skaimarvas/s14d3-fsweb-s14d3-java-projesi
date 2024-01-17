package com.workintech.polymorphism;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders &&  Objects.equals(name, car.name);
    }

    public void startEngine(){
        System.out.println( name + "'s engine is starting. Class: " + getClass().getSimpleName());

    }

    public void accelerate(){
        System.out.println(getClass().getSimpleName() + " is accelerating" );
    }

    public void brake(){
        System.out.println(getClass().getSimpleName() + " is braking");
    }

}

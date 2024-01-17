package com.workintech.polymorphism;

public class Ford extends Car {
        public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public void startEngine() {
        System.out.println(getName() + "'s engine is starting");

    }

    @Override
    public void accelerate() {

        System.out.println(getName() + " is accelerating");
    }

    @Override
    public void brake() {

        System.out.println(getName() + " is braking");
    }
}

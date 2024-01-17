package com.workintech.polymorphism;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void startEngine(){
        System.out.println(getName() + " started to the engine");

    }
    public void drive(){
        System.out.println(getName() + " is driving" );
        runEngine();

    }
    protected void runEngine(){
        System.out.println(getName() + "'s engine is working");
    }
}

package com.driver;

public class Boat extends Vehicle implements WaterVehicle{

    int Capacity;

    public Boat(String name) {
        super(name);
    }

    public int setCapacity(int capacity){
        this.Capacity=capacity;
    }
    public void Boat(){

    }
    @Override
    public String getVehicleName() {
        return getName();
    }

    @Override
    public int getVehicleCapacity() {
        return Capacity;
    }
}

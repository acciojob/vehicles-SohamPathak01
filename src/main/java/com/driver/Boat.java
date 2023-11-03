package com.driver;

public class Boat implements WaterVehicle{

    String name;
    int Capacity;

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity){
        this.Capacity=capacity;

    }
    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return Capacity;
    }
}

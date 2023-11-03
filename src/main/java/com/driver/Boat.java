package com.driver;

public class Boat extends Vehicle implements WaterVehicle{

    String name;
    int Capacity;
    public Boat(String name,int Capacity){
        super(name);
        this.Capacity=Capacity;
    }

   // public void setName(String name) {
     //   this.name = name;
    //}

    //public void setCapacity(int capacity){
      //  this.Capacity=capacity;

    //}
    @Override
    public String getVehicleName() {
        return getName();
    }

    @Override
    public int getVehicleCapacity() {
        return Capacity;
    }
}

package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

        Boat b=new Boat("Merry-Go",7);
       // b.setName("merrygo");
        //b.setCapacity(7);

        System.out.println(b.getVehicleName()+" has capacity of "+ b.getVehicleCapacity()+" people" );
    }
}
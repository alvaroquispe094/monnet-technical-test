package com.monnet;

import com.monnet.models.*;

public class MainApplication {
    public static void main( String[] args ) {

        Vehicle vehicle = new Vehicle();

        System.out.println( "Monday" );
        vehicle.setCar(new WorkCar());
        vehicle.use();
        System.out.println();

        System.out.println( "Tuesday" );
        vehicle.setCar(new RaceCar());
        vehicle.use();
        System.out.println();

        System.out.println( "Wednesday & Thursday" );
        vehicle.setCar(new OffRoadCar());
        vehicle.use();
        System.out.println();

        System.out.println( "Friday" );
        vehicle.setCar(new SecretAgentCar());
        vehicle.use();
    }
}

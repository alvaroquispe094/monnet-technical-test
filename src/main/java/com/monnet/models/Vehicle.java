package com.monnet.models;

import com.monnet.interfaces.*;

public class Vehicle {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void use() {
        if (car != null) {
            car.use();
        } else {
            System.out.println("No se ha configurado un auto.");
        }
    }
}

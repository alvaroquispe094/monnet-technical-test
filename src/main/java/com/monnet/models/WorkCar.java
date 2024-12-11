package com.monnet.models;

import com.monnet.interfaces.*;

public class WorkCar implements Car {
    @Override
    public void use() {
        System.out.println("Driving to work.");
    }
}

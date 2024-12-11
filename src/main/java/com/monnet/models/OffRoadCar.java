package com.monnet.models;

import com.monnet.interfaces.*;

public class OffRoadCar implements Car {
    @Override
    public void use() {
        System.out.println("Driving off road.");
    }
}

package com.monnet.models;

import com.monnet.interfaces.*;

public class RaceCar implements Car {
    @Override
    public void use() {
        System.out.println("Running a race.");
    }
}

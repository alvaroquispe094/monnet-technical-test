package com.monnet.models;

import com.monnet.interfaces.*;

public class SecretAgentCar implements Car, Equipment {
    @Override
    public void use() {
        System.out.println("Driving as secret agent.");
        this.camouflage();
        this.shoot();
    }
    @Override
    public void camouflage() {
        System.out.println("Using camouflage...");
    }

    @Override
    public void shoot() {
        System.out.println("shooting...");
    }
}

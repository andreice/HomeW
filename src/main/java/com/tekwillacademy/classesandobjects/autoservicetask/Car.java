package com.tekwillacademy.classesandobjects.autoservicetask;

public class Car {
    String plateNr;
    int km;
    String color;
    String make;
    String model;

    // Pasul 4: Definim câte 2 Constructori pentru clasele Car și Tool

    public Car (String makeInput, String modelInput, String colorInput){
        this.make = makeInput;
        this.model = modelInput;
        this.color = colorInput;
    }
    public Car (String makeInput){
        make = makeInput;
    }
}

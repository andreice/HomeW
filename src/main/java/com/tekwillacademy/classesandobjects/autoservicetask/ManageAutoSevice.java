package com.tekwillacademy.classesandobjects.autoservicetask;

public class ManageAutoSevice {
    public static void main(String[] args) {
        // Deckararea si initializarea obiectelor folosing toate tipurile de constructori
        Car audiA6 = new Car("Audi", "A6","Negru");
        audiA6.km = 250;
        audiA6.plateNr = "13456";

        System.out.println("Masina: " +  audiA6.make + " de modelul: " + audiA6.model + " si culoarea: "+ audiA6.color);


        Car mercedesSclass = new Car("SClass");

        Tool ciocan = new Tool();

        Worker ionMuncitor = new Worker();

        Garage garageNr1 = new Garage();
    }
}

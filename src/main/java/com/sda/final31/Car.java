package com.sda.final31;

import java.util.Objects;

public class Car {

    private String model;
    private String vin;
    private String colour;

    public Car(String model, String vin) {
        this.model = model;
        this.vin = vin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(vin, car.vin);
    }

    @Override
    public int hashCode() {
        return 11;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}

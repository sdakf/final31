package com.sda.final31.excercises.others;

import java.util.Objects;

public class SameHashCar implements Comparable<SameHashCar>{

    private String model;
    private String vin;
    private String colour;

    public SameHashCar(String model, String vin) {
        this.model = model;
        this.vin = vin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SameHashCar car = (SameHashCar) o;
        return Objects.equals(vin, car.vin);
    }

    @Override
    public int hashCode() {
        return 4;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    @Override
    public int compareTo(SameHashCar otherCar) {
        return this.vin.compareTo(otherCar.vin);
    }
}

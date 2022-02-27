package com.sda.final31;

import com.sda.final31.excercises.others.Car;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTest {

    @Test
    void name() {

        Car car1 = new Car("Audi", "123");
        Car car2 = new Car("Audi", "124");
        Car car3 = new Car("Audi", "125");

        Set<Car> objects = new HashSet<>();
        objects.add(car1);
        objects.add(car2);
        objects.add(car3);
        System.out.println(objects.size());
    }

    @Test
    void treeSet() {
        Set<String> objects = new TreeSet<>();
        objects.add("c");
        objects.add("a");
        objects.add("b");
        objects.add("a");
        System.out.println(objects);

    }

    @Test
    void string() {
        String x = "a";
        x = x + "b";
        System.out.println(x);
    }
}

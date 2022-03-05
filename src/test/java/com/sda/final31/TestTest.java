package com.sda.final31;

import com.sda.final31.excercises.others.Car;
import com.sda.final31.excercises.others.SameHashCar;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TestTest {

    @Test
    void czary() {
        String s = 'a' + 'b' + "c";
        boolean a = s == 97 + 98 + "c";
    }

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
    void sameHash() {

        SameHashCar car1 = new SameHashCar("Audi", "123");
        SameHashCar car2 = new SameHashCar("Audi", "124");
        SameHashCar car3 = new SameHashCar("Audi", "125");

        Set<SameHashCar> objects = new HashSet<>();
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


    @Test
    void collectionSpeed() {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            list1.add(i);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            list2.add(i);
        }
        list2.add(-1);

        list2.removeAll(list1);
        System.out.println(list1);

    }

    @Test
    void collectionSpeedSet() {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            list1.add(i);
        }
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < 1_000_000; i++) {
            set.add(i);
        }
        set.add(-1);

        set.removeAll(list1);
        System.out.println(set);

    }

    @Test
    void treeSet2() {
        Set<String> animals = new TreeSet<>();
        animals.add("mouse");
        animals.add("cat");
        animals.add("hamster");
        animals.add("rabbit");
        System.out.println(animals);
    }

    @Test
    void carsTreeSet() {
        SameHashCar car1 = new SameHashCar("Audi", "124");
        SameHashCar car2 = new SameHashCar("Audi", "124");
        SameHashCar car3 = new SameHashCar("Audi", "125");

        Set<SameHashCar> cars = new TreeSet<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        System.out.println(cars);
    }
}

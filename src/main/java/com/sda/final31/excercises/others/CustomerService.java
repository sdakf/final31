package com.sda.final31.excercises.others;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerService {

    Customer[] people = new Customer[]{
            new Customer("Anna", "Nowak   ", 33, "1200"),
            new Customer("Beata", "Kowalska", 22, "1200"),
            new Customer("Marek", " Nowak", 25, "1250 "),
            new Customer("Adam", "Twardowski", 33, "4100 "),
            new Customer("Monika  ", "Kos", 25, "2500"),
            new Customer("Adam ", "Rudy", 45, "3333"),
            new Customer("Marek", "Rudy", 15, 2210),
            new Customer("Adam", "Madej", 15, 3333),
            new Customer("Adam", "Nowak ", 15, null)
    };


    //    3. Napisz metodę, która zwróci mapę osób <id,osoba>
    public Map<Long, Customer> toIdMap() {
        Map<Long, Customer> map = new HashMap<>();
        for (Customer person : people) {
            map.put(person.getId(), person);
        }
        return map;
    }

    public Map<Long, Customer> toIdMapWithStream() {
        return Arrays.stream(people)
                .collect(Collectors.toMap(c -> c.getId(), c -> c));
    }

//    5. Napisz metodę, która zwróci mapę ile jest osób z danymi zarobkami <zarobki, liczba_osób>

    public Map<BigDecimal, Integer> countBySalary() {
        Map<BigDecimal, Integer> resultMap = new HashMap<>();
        for (Customer person : people) {
            if (resultMap.containsKey(person.getSalary())) {
                Integer counter = resultMap.get(person.getSalary());
                counter = counter + 1;
                resultMap.put(person.getSalary(), counter);
            } else {
                resultMap.put(person.getSalary(), 1);
            }
        }
        return resultMap;
    }

    public Map<BigDecimal, Long> countBySalaryWithStream() {
        return Arrays.stream(people)
                .collect(Collectors.groupingBy(c -> c.getSalary(), Collectors.counting()));
    }


}


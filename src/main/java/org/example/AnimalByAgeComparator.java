package org.example;

import java.util.Comparator;

public class AnimalByAgeComparator implements Comparator<PatAnimal> {
    Order order;

    public AnimalByAgeComparator(Order order) {
        this.order = order;
    }

    @Override
    public int compare(PatAnimal o1, PatAnimal o2) {
        if (order == Order.ASCENDING)
            return o2.getAge() - o1.getAge();
        else return o1.getAge() - o2.getAge();
    }
}

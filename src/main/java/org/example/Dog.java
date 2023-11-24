package org.example;

import java.util.Comparator;
import java.util.Random;

public class Dog extends PatAnimal implements Comparable<Dog> {
    public Dog(String name, int yearOfBirth) {
        super(name, yearOfBirth);
    }

    public int scaredOfThievesCount(){
        return new Random().nextInt(0,100);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
        return scaredOfThievesCount()-o.scaredOfThievesCount();
    }
}

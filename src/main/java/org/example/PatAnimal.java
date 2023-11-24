package org.example;

import java.time.LocalDate;

public class PatAnimal {

    String name;
    int yearOfBirth;

    public PatAnimal(String name, int yearOfBirth){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public int getAge(){
        return yearOfBirth;
    }

    public String getName(){
        return name;
    }

    public void sleep(){}

    public void makeSound(){}

    @Override
    public String toString() {
        return "PatAnimal{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}

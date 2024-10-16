package lab7;

import lab7.animals.farm.Cow;
import lab7.animals.farm.Pig;
import lab7.animals.pet.Cat;
import lab7.animals.pet.Dog;

public class P7_5 {
    public static void main(String[] args) {
        // Testar Cat and Dog
        Cat cat1 = new Cat("Simba", 2015, true);
        Dog dog1 = new Dog("Max", 2012, true);

        System.out.println(cat1.getDescription());
        System.out.println(cat1.makeSound());
        
        System.out.println(dog1.getDescription());
        System.out.println(dog1.makeSound());

        // Testar Cow and Pig
        Cow cow1 = new Cow(123, 2010);
        Pig pig1 = new Pig(456, 2013);

        System.out.println(cow1.getDescription());
        System.out.println(cow1.makeSound());

        System.out.println(pig1.getDescription());
        System.out.println(pig1.makeSound());
    }
}
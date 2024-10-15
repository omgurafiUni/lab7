package lab7.animals.farm;

import lab7.animals.Animal;

public class Pig extends Animal {
    private int id;

    // Constructor with id and birthYear
    public Pig(int id, int birthYear) {
        super("Ingen namn", birthYear); // Pass default name
        this.id = id;
    }

    public String makeSound() {
        return "Nöff nöff!";
    }

    public String getDescription() {
        return "Gris, id: " + id + ", " + getAge() + " år";
    }
}

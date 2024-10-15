package lab7.animals.farm;

import lab7.animals.Animal;

public class Cow extends Animal {
    private int id;

    // Constructor with id and birthYear
    public Cow(int id, int birthYear) {
        super("Ingen namn", birthYear); // Pass default name
        this.id = id;
    }

    public String makeSound() {
        return "Mu mu!";
    }

    public String getDescription() {
        return "Ko, id: " + id + ", " + getAge() + " år";
    }
}

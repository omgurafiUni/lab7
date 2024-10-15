package lab7.animals;

import java.util.Calendar;

public class Animal {
	private String name = null;
	private int birthYear;
	private int presentYear = Calendar.getInstance().get(Calendar.YEAR);
	
	public Animal(String name) {
		this(name, Calendar.getInstance().get(Calendar.YEAR));
	}
	
	public Animal(String name, int birthYear) {
        setName(name);
        setBirthYear(birthYear);
    }
	
	private void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }
	
	private void setBirthYear(int birthYear) {
        if (birthYear > presentYear) {
            throw new IllegalArgumentException("Birth year cannot be in the future");
        }
        this.birthYear = birthYear;
    }
	
	public String getName() {
        return name;
    }

    public int getAge() {
        return presentYear - birthYear;
    }
}

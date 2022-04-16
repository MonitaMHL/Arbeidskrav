import java.text.MessageFormat;

public class Person {

    private final int id;
    private String name;
    private int birthYear;

    static int nextId = 1;

    public Person( String name, int birthYear) {
        this.id = nextId++;
        this.name = name;
        this.birthYear = birthYear;
    }
    public Person() {
        id = nextId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }


    public void display() {
        System.out.println("Person");
        System.out.println("\tid: " + getId());
        System.out.println("\tName: " + getName());
        System.out.println("\tYear of birth: " + getBirthYear());
        System.out.println("\tCars:");
    }
}


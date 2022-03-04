import java.util.ArrayList;
import java.util.List;

public class Person {
    public int teller = 0;
    private String name;
    private int birthYear;
    List<Cars> cars= new ArrayList<>();





    Person(int customerID, String name, int birthYear, List<Cars> cars) {
        this.teller = customerID;
        this.name = name;
        this.birthYear = birthYear;
        for (Cars car : this.cars) {


        }


    }
    public String getName() {
        return name;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public int getCustomerID() {
        teller++;
        return teller;
    }

    public List<Cars> getCars() {
        return cars;
    }
    void show() {
        System.out.println("Customer ID: " + getCustomerID() + "\n" + "Name: " + getName() + "\n" + "Birthyear: "
                + getBirthYear() + "\n" + "Cars: " + getCars() );

    }
}

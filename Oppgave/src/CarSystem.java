import java.util.*;

public class CarSystem {
    ArrayList<Person> personList = new ArrayList<>();
    ArrayList<Cars> carList = new ArrayList<>();
    ArrayList<Integer> personAgeList = new ArrayList<>();
    ArrayList<Integer> carAgeList = new ArrayList<>();
    ArrayList<Integer> carMilageList = new ArrayList<>();

    Calendar calendar = Calendar.getInstance();

    public CarSystem() {
    }

    public void create() {

        Person person1 = new Person("Monita Lillelien", 1987);
        Person person2 = new Person("Richard Ness", 1981);
        Person person3 = new Person("Caroline Lillelien", 1982);
        Person person4 = new Person("Marie Lingelem Karlsen",1991);
        Person person5 = new Person("Unni Wenche Lillelien", 1937);
        personList.addAll(List.of(new Person[]{person1, person2, person3, person4, person5}));

        Cars car1 = new Cars.Personal("Mitshubitshi", "Outlander", 2008, 100000, "2022-03-23", person1);
        Cars car2 = new Cars.Van("Peugot", "Partner", 2021, 20000, "2022-02-28", person2);
        Cars car3 = new Cars.Truck("Isuzu", "D-Max", 2020, 32000, "2022-01-25", person3);
        Cars car4 = new Cars.Personal("Volvo", "C40", 2019, 21500, "2022-02-18", person4);
        Cars car5 = new Cars.Personal("Honda", "Accord", 2012, 142050, "2020-12-18", person5);
        carList.addAll(List.of(new Cars[]{car1, car2, car3, car4, car5}));

        carAgeList.addAll(List.of(calendar.get(Calendar.YEAR) - car1.getProductionYear(),
                (calendar.get(Calendar.YEAR) - car2.getProductionYear()),
                (calendar.get(Calendar.YEAR) - car3.getProductionYear()),
                (calendar.get(Calendar.YEAR) - car4.getProductionYear())));

        personAgeList.addAll(List.of((calendar.get(Calendar.YEAR) - person1.getBirthYear()),
                (calendar.get(Calendar.YEAR) - person2.getBirthYear()),
                (calendar.get(Calendar.YEAR) - person3.getBirthYear()),
                (calendar.get(Calendar.YEAR) - person4.getBirthYear())));

        carMilageList.addAll(List.of(car1.getMilage(),
                car2.getMilage(),
                car3.getMilage(),
                car4.getMilage()));
    }

    public void display() {
        for (Person person : personList) {
            person.display();
            for (Cars car : carList) {
                if (car.getOwnedBy() == person.getId()) {
                    car.display();
                }
            }
        }
    }

    public void displayAverageAgePerson() {

        int averageAgePerson = (int) personAgeList.stream()
                .mapToInt(d -> d)
                .average()
                .orElse(0);

        System.out.println("The average car owner age is: " + averageAgePerson);
    }

    public void displayAverageCarAge() {

        int averageCarAge = (int) carAgeList.stream()
                .mapToInt(d -> d)
                .average()
                .orElse(0);

        System.out.println("The average car age is: " + averageCarAge);
    }

    public void displayAverageCarMilage() {

        int averageCarMilage = (int) carMilageList.stream()
                .mapToInt(d -> d)
                .average()
                .orElse(0);

        System.out.println("The average car milage is: " + averageCarMilage);
// FDLDD
    }

}






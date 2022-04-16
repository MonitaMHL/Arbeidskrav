public class Arbeidskrav_1 {
    public static void main(String[] args) {
        CarSystem carSystem = new CarSystem();
        carSystem.create();
        carSystem.display();
        carSystem.displayAverageAgePerson();
        carSystem.displayAverageCarAge();
        carSystem.displayAverageCarMilage();
    }
}

public class Cars {

public enum CarType {

    PERSONAL,
    VAN,
    TRUCK
}

    private final String producer;
    private final String name;
    private final CarType carType;
    private final int productionYear;
    private final int milage;
    private final String milageDate;
    private final int ownedBy;

    public Cars(String producer, String name, CarType carType, int productionYear, int milage, String milageDate, Person owner) {
        this.producer = producer;
        this.name = name;
        this.carType = carType;
        this.productionYear = productionYear;
        this.milage = milage;
        this.milageDate = milageDate;
        this.ownedBy = owner.getId();
    }

    public String getProducer() {
        return producer;
    }

    public String getName() {
        return name;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getMilage() {
        return milage;
    }

    public String getMilageDate() {
        return milageDate;
    }

    public int getOwnedBy() {
        return ownedBy;
    }

    public void display() {
        System.out.println("\t\tProducer: " + getProducer());
        System.out.println("\t\tName: " + getName());
        System.out.println("\t\tType: " + getCarType());
        System.out.println("\t\tProduction year: " + getProductionYear());
        System.out.println("\t\tMileage: " + getMilage());
        System.out.println("\t\tMileage date: " + getMilageDate());
        System.out.println();
    }

    public static class Personal extends Cars {

        public Personal(String producer, String name, int productionYear, int milage, String milageDate, Person owner) {
            super(producer, name, CarType.PERSONAL, productionYear, milage, milageDate, owner);

        }

    }

    public static class Truck extends Cars {

        public Truck(String producer, String name, int productionYear, int milage, String milageDate, Person owner) {
            super(producer, name, CarType.TRUCK, productionYear, milage, milageDate, owner);

        }

    }

    public static class Van extends Cars {

        public Van(String producer, String name, int productionYear, int milage, String milageDate, Person owner) {
            super(producer, name, CarType.VAN, productionYear, milage, milageDate, owner);

        }

    }
}

public class Cars {
    String producer;
    String name;
    String type;
    int productionYear;
    int milage;
    int milageDate;
    Cars(String producer, String name, String type, int productionYear, int milage, int milageDate) {
        this.producer = producer;
        this.name = name;
        this.type = type;
        this.productionYear = productionYear;
        this.milage = milage;
        this.milageDate = milageDate;
    }


    void show() {
        System.out.println("Producer: " + producer + "\n" + "Name: " + name + "\n" + "Type: " + type + "\n" + "Production Year: "
                + productionYear + "\n" + "Milage: " + milage + "\n" + "Milage Date: " + milageDate);
    }


}

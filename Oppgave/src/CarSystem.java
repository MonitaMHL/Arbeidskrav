import java.util.List;
import java.util.OptionalDouble;

public class CarSystem extends Person {

    CarSystem(int customerID, String Name, int BirthYear, List<Cars> cars) {
        super(customerID, Name, BirthYear, cars);


    }

    /*OptionalDouble average = cars
            .stream()
            .mapToDouble(a -> a)
            .average();

     */

}






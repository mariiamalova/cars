package dao;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private static int CARS_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++CARS_COUNT, "fiat", "111"));
        cars.add(new Car(++CARS_COUNT, "golf", "222"));
        cars.add(new Car(++CARS_COUNT, "hyndai", "333"));
        cars.add(new Car(++CARS_COUNT, "lada", "444"));
        cars.add(new Car(++CARS_COUNT, "hyndai", "555"));

    }

    public List<Car> showAll(Integer count) {
        if ((count == null) || (count >= 5)) {
            return cars;
       } else if ((count < 5) || (count > 0)) {
            return cars.stream().limit(count).toList();
        } else {
            return null;
        }
    }

}

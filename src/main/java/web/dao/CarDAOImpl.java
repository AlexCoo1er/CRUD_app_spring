package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarDAOImpl implements CarDAO{
    private List<Car> cars;
    private static int ID_CARS;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++ID_CARS, "yellow", "crossover"));
        cars.add(new Car(++ID_CARS, "green", "crossover"));
        cars.add(new Car(++ID_CARS, "brown", "crossover"));
        cars.add(new Car(++ID_CARS, "red", "crossover"));
        cars.add(new Car(++ID_CARS, "blue", "crossover"));
    }
    @Override
    public List<Car> amountOfCars(int k) {
        if (k == 0 || k > 5 ) {
            return  cars;
        } return cars.stream().limit(k).collect(Collectors.toList());
    }
}

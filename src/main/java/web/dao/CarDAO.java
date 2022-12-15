package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;
@Component
public interface CarDAO {

    List<Car> amountOfCars(int k);

}

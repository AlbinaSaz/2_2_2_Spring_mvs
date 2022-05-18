package web.Dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DaoCar implements DaoCarInterface{
    @Override
    public List<Car> addCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", 80, "red"));
        cars.add(new Car("Lada", 120, "black"));
        cars.add(new Car("Audi", 108, "green"));
        cars.add(new Car("Kia", 110, "white"));
        cars.add(new Car("Ford", 160, "pink"));
        cars.add(new Car("Lada", 98, "red"));
        return cars;
    }
}

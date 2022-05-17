package web.controller;

import web.Model.Car;
import web.Servise.ServiceCarInterface;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private ServiceCarInterface serviceCar;

   @Autowired
    public CarController (ServiceCarInterface serviceCar){
       this.serviceCar = serviceCar;
   }


    @GetMapping(value = "/cars")
    public String getCar(@NotNull ModelMap model, @RequestParam(value = "count", defaultValue = "5") String count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", 80, "red"));
        cars.add(new Car("Lada", 120, "black"));
        cars.add(new Car("Audi", 108, "green"));
        cars.add(new Car("Kia", 110, "white"));
        cars.add(new Car("Ford", 160, "pink"));
        cars.add(new Car("Lada", 98, "red"));
        cars = serviceCar.counter(cars, count);
        model.addAttribute("cars", cars);
        return "car";
    }

}

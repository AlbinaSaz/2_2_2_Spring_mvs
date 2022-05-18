package web.controller;

import web.Dao.DaoCarInterface;
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
    private DaoCarInterface daoCar;

   @Autowired
    public CarController (ServiceCarInterface serviceCar, DaoCarInterface daoCar){
       this.serviceCar = serviceCar;
       this.daoCar = daoCar;
   }


    @GetMapping(value = "/cars")
    public String getCar(@NotNull ModelMap model, @RequestParam(value = "count", defaultValue = "5") String count) {
       List<Car> cars =  daoCar.addCars();
        cars = serviceCar.counter(cars, count);
        model.addAttribute("cars", cars);
        return "car";
    }

}

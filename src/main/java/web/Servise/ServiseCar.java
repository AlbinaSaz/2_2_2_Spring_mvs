package web.Servise;

import web.Model.Car;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class ServiseCar implements ServiceCarInterface {

    @Override
    public List<Car> counter(List<Car> list, String counter) {
        if (Integer.parseInt(counter)>=5){
            return list;
        }
        list = list.stream().limit(Integer.parseInt(counter)).collect(Collectors.toList());
        return list;
    }

}

package web.Servise;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ServiceCar implements ServiceCarInterface {

    @Override
    public List<Car> counter(List<Car> list, String counter) {
        if (Integer.parseInt(counter)>=5){
            return list;
        }
        list = list.stream().limit(Integer.parseInt(counter)).collect(Collectors.toList());
        return list;
    }

}

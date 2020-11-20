package pl.marczewski.asweek4thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/car")
    public String getCar(Model model){
        Car car1 = new Car("BMW", "i8");
        Car car2 = new Car("Volvo", "S90");
        Car car3 = new Car("Mercedes", "E");
        Car car4 = new Car("Audi", "A6");

        List<Car> cars = Arrays.asList(car1, car2, car3, car4);

        model.addAttribute("cars", cars);
        return "car";
    }
}

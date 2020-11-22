package pl.marczewski.asweek4thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    private List<Car> cars;

    public CarController() {
        Car car1 = new Car("BMW", "i8");
        Car car2 = new Car("Volvo", "S90");
        Car car3 = new Car("Mercedes", "E");
        Car car4 = new Car("Audi", "A6");

        cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
    }

    @GetMapping("/car")
    public String getCar(Model model){
        model.addAttribute("cars", cars);
        model.addAttribute("newCar", new Car());
        return "car";
    }

    @GetMapping("/add-car")
    public String addCar(@RequestParam String model, @RequestParam String mark){
        cars.add(new Car(model, mark));
//        return "redirect:/car";
        return "car";
    }

}

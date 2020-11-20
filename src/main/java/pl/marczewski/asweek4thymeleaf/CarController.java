package pl.marczewski.asweek4thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    @GetMapping("/car")
    public String getCar(Model model){
        Car car = new Car("BMW", "i8");

        model.addAttribute("name", "Mariusz");
        model.addAttribute("car", car);
        return "car";
    }
}

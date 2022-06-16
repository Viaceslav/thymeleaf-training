package pl.pawlowski.helloword;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/car")
    public String getCar(Model model){

        Car car1 = new Car("BMW", "i8");
        Car car2 = new Car("Hunday", "i30");
        Car car3 = new Car("Volvo", "t4");
        Car car4 = new Car("Volvo", "Tero");
        Car car5 = new Car("Nissan", "QashQai");
        Car car6 = new Car("Mazda", "Cx5");

        List<Car> cars = Arrays.asList(car1, car2, car3, car4, car5, car6);

        model.addAttribute("cars", cars);

        return "car" ;
    }
}

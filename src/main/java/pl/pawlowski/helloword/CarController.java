package pl.pawlowski.helloword;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    @GetMapping("/car")
    public String getCar(Model model){
        Car car1 = new Car("BMW", "i8");
//        Car car2 = new Car("Hunday", "i30");
//        Car car3 = new Car("Seat", "Toledo");


        model.addAttribute("name", "Sławek");
        model.addAttribute("car", car1);

        return "car" ;
    }
}

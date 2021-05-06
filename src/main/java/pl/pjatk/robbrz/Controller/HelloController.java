package pl.pjatk.robbrz.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.robbrz.Car;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHelloWorld() {
        // return ResponseEntity.status(HttpStatus.OK).body("Hello World");
        // return ResponseEntity.ok("Hello World!");
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @GetMapping("/car")
    public ResponseEntity<Car> getCar(Car car) {
        return ResponseEntity.ok(car);
    }
    @GetMapping("/model")
    public ResponseEntity<Car> testModel(){
        Car car = new Car("Honda", "Civic");
        return ResponseEntity.ok(car);
    }

    @PostMapping("/new")
    public ResponseEntity<Car> addNewCar(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }
}

package pl.pjatk.robbrz.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.robbrz.Car;

@RestController
@RequestMapping
public class JazRestController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
        return new ResponseEntity<>("hello world", HttpStatus.OK);
    //    return ResponseEntity.ok("Hello world");
}
    //@GetMapping("/test/hello/{anything}")
    //public ResponseEntity<String> sayHello(@PathVariable String anything) {
    //    return ResponseEntity.ok(anything);
   // }
    @GetMapping("/hello/abc")
    public ResponseEntity<String> getRequestParam(@RequestParam String someValue) {
        return ResponseEntity.ok(someValue);
    }
    @PostMapping("/model")
    public ResponseEntity<Car> addModel(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }

}

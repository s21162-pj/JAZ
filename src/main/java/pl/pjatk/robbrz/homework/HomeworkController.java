package pl.pjatk.robbrz.homework;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkController
{

    @GetMapping("/get/{someValue}")
    public ResponseEntity<String> getPathVariable(@PathVariable String someValue){
        return ResponseEntity.ok(someValue);
    }
    @GetMapping("/get/value")
    public ResponseEntity<String> getRequestParam(@RequestParam String someValue){
        return ResponseEntity.ok(someValue);
    }
    @PutMapping("/put/{someValue}")
    public ResponseEntity<String> putPathVariable(@PathVariable String someValue){
        return ResponseEntity.ok(someValue);
    }
    @PutMapping("/put/put_body_req")
    public ResponseEntity<String> putRequestBody(@RequestBody String someValue){
        return ResponseEntity.ok(someValue);
    }
    @PostMapping("/post/post_body_req")
    public ResponseEntity<String> postRequestBody(@RequestBody String someValue){
        return ResponseEntity.ok(someValue);
    }
    @DeleteMapping("/del/{someValue}")
    public ResponseEntity<Void> deletePathVariable(@PathVariable String someValue){
        return ResponseEntity.ok().build();
    }
}

package pl.pjatk.robbrz;

import org.springframework.stereotype.Component;

@Component
public class SecondClass {

    public SecondClass() {
        System.out.println("SecondClass");
    }

    public void helloFromMethod(){
        System.out.println("hello from my second component.helloFromMethod");
    }
}
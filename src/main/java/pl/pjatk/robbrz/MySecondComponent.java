package pl.pjatk.robbrz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MySecondComponent {

    public MySecondComponent(
            @Value("${my.custom.property}") String fromAppProp,
            @Value("${my.custom.random:myDefaultValue}") String random) {
        System.out.println("MySecondComponent");
        System.out.println(fromAppProp);
        System.out.println(random);
    }
}
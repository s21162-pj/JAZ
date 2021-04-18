package pl.pjatk.robbrz;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ComponentConfig {

    @Bean
    public MySimpleClass mySimpleClass() {
        return new MySimpleClass("Hello from bean mySimpleClass");
    }

    @Bean
    public MySimpleClass mySecondSimpleClass() {
        return new MySimpleClass("Hello from bean mySimpleClass");
    }
}
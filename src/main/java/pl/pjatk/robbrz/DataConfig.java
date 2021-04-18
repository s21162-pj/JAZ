package pl.pjatk.robbrz;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataConfig {

    @Bean
    public MySimplePojo mySimplePojo() {
        return new MySimplePojo();
    }

    @Bean
    public List<String> defaultData() {
        return List.of("1", "2", "3", "4", "5");
    }

    @Bean
    public List<MySimplePojo> mySimplePojoList(MySimplePojo mySimplePojo) {
        return List.of(mySimplePojo);
    }

    @Bean
    @ConditionalOnProperty(name = "spring.my.custom.bool", havingValue = "true")
    public void isTrue(){
        System.out.println("Value in yml is true");
    }
    @Bean
    @ConditionalOnExpression("${jumping.toadstool:true}")
   @ConditionalOnProperty(value="jumping.toadstool", havingValue = "true")
   public String jumpingToadstool() {
       return "This is jumping toadstool bean! Say Hello!";
   }
}
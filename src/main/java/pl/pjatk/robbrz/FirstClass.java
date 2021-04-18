package pl.pjatk.robbrz;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class FirstClass {
    public FirstClass(
        SecondClass secondClass,
        MySimplePojo mySimplePojo,
                List<String> defaultData
    )
    {


        System.out.println("FirstClass");
        secondClass.helloFromMethod();
        mySimplePojo.printOutMe();
        System.out.println(defaultData);

}}
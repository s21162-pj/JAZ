package pl.pjatk.robbrz;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ThirdClass {
//
//    public ThirdClass(ApplicationContext applicationContext){
//        FirstClass FirstClass = applicationContext.getBean("FirstClass", FirstClass.class);
//        SecondClass SecondClass = applicationContext.getBean("SecondClass", SecondClass.class);
//        secondClass.helloFromMethod();
//
//        System.out.println("ThirdClass");
//    }
//    public ThirdClass(FirstClass firstClass, SecondClass secondClass){
//        secondClass.helloFromMethod();
//        System.out.println("hello From Third Class");
//    }
    public ThirdClass(
        FirstClass firstClass,
        SecondClass secondClass,
        MySimpleClass mySimpleClass,
        MySimpleClass mySecondSimpleClass)
    }
{
    secondClass.helloFromMethod();
    System.out.println(" hello from third class");
    System.out.println(mySimpleClass.getName());
    System.out.println(mySecondSimpleClass.getName());
}
}
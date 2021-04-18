package pl.pjatk.robbrz;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class MyThridComponent {
//    public MyThridComponent(ApplicationContext applicationContext) {
//        MyFirstComponent myFirstComponent = applicationContext.getBean("myFirstComponent", MyFirstComponent.class);
//        MySecondComponent mySecondComponent = applicationContext.getBean("mySecondComponent", MySecondComponent.class);
//        System.out.println("MyThridComponent");
//    }
//    public MyThridComponent(MyFirstComponent myFirstComponent, MySecondComponent mySecondComponent ) { //to to samo
//        System.out.println("MyThridComponent");
//    }

    public MyThridComponent(MyFirstComponent myFirstComponent,
                            MySecondComponent mySecondComponent,
                            MySimpleClass mySimpleClass,
                            MySimpleClass mySecondSimpleClass) {
        //mySecondComponent
        System.out.println("Hello from MyThfidComponent");
        System.out.println(mySimpleClass.getName());
        System.out.println(mySecondSimpleClass.getName());
    }
}
package com.jacobcadena.didemo;

import com.jacobcadena.didemo.controllers.ConstructorInjectedController;
import com.jacobcadena.didemo.controllers.MyController;
import com.jacobcadena.didemo.controllers.PropertyInjectedController;
import com.jacobcadena.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        // Created an Application context
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
        controller.hello();


        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}

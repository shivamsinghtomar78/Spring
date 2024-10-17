package com.example.demo;

import com.example.demo.Model.Laptop;
import com.example.demo.Service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

@SpringBootDemoApplication.SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(SpringBootDemoApplication.class, args);

        LaptopService service=context.getBean(LaptopService.class);
        Laptop laptop=context.getBean(Laptop.class);
        service.add(laptop);



//		Alien obj=context.getBean(Alien.class);
//		System.out.println(obj.getAge());
//		obj.code();
    }

    public static @interface SpringBootApplication {
    }
}
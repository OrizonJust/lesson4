package edu.laverno.springbootapplication;

import edu.laverno.springbootapplication.service.Example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);

        Example s = context.getBean(Example.class);

        System.out.println(s.test());
    }

}

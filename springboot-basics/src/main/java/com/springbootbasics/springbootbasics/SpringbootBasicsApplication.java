package com.springbootbasics.springbootbasics;

import com.springbootbasics.springbootbasics.controller.MyMainClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBasicsApplication implements CommandLineRunner {
    @Autowired
    MyMainClass myMainClass;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBasicsApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Inside Main method " + System.currentTimeMillis() / 1000);
        for (int i = 0; i <= 5; i++) {
            myMainClass.Scheduleduler("Aqib");

        }
    }
}

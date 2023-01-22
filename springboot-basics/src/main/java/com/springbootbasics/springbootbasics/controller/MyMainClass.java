package com.springbootbasics.springbootbasics.controller;

import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Component
public class MyMainClass {

    public void Scheduleduler(String name){
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.schedule(() -> check(name), 3, TimeUnit.SECONDS);
    }

    private static void check(String name) {
        System.out.println("Inside Scheduleduler method " + System.currentTimeMillis() / 1000);
        System.out.println(name + Thread.currentThread());
    }
}
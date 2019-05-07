package com.duleendra.testfactory;

import com.duleendra.testfactory.factory.NotificationFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestFactoryApplication implements CommandLineRunner {

    @Autowired
    private NotificationFactory notificationFactory;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("test");
        String sms = "sms";
        String email = "email";

        notificationFactory.getNotification(sms).send();
        notificationFactory.getNotification(email).send();
    }




    public static void main(String[] args) {

        SpringApplication.run(TestFactoryApplication.class, args);


    }

}

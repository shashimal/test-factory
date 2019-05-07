package com.duleendra.testfactory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Email implements Notificaition {

    @Autowired
    OtherService otherService;

    @Override
    public void send() {

        System.out.println("Sending email");
        otherService.printOtherService("EMAIL");;
    }
}

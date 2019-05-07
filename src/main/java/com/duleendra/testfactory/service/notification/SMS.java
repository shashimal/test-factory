package com.duleendra.testfactory.service.notification;

import com.duleendra.testfactory.service.OtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SMS implements Notificaition {

    @Autowired
    OtherService otherService;

    @Override
    public void send() {
        System.out.println("Sending SMS");
        otherService.printOtherService("SMS");
    }
}

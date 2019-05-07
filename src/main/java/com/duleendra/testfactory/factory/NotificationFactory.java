package com.duleendra.testfactory.factory;

import com.duleendra.testfactory.service.Email;
import com.duleendra.testfactory.service.Notificaition;
import com.duleendra.testfactory.service.SMS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class NotificationFactory {

    private final Email email;
    private final SMS sms;

    @Autowired
    public NotificationFactory(Email email, SMS sms) {
        this.email = email;
        this.sms = sms;
    }

    public  Notificaition getNotification(String service) {
        service = service.toLowerCase();

        if (service.equals("email")) {
            return email;
        } else if (service.equals("sms")) {
            System.out.println(service);
            return sms;
        } else {
            return null;
        }
    }
}

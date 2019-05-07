package com.duleendra.testfactory.factory;

import com.duleendra.testfactory.service.notification.Email;
import com.duleendra.testfactory.service.notification.Notificaition;
import com.duleendra.testfactory.service.notification.SMS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationFactory {

    private  Email email;
    private  SMS sms;

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
            return sms;
        } else {
            return null;
        }
    }
}

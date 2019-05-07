package com.duleendra.testfactory.service;

import org.springframework.stereotype.Service;

@Service
public class OtherServiceImpl implements OtherService {

    public void printOtherService(String other) {
        System.out.println("Other service "+ other);
    }
}

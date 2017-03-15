package org.spring.service.impl;

import org.spring.service.MyService;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService
{
    @Override
    public void service()
    {
        System.out.println("service called");
    }
}

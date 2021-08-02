package com.guomz.springbootdubbo.dubboService.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.guomz.entity.Student;
import org.guomz.service.MyService;

@DubboService(version = "1.0.0")
public class MyServiceImpl implements MyService {
    @Override
    public String sayHello() {
        System.out.println("被调用了");
        return "hello";
    }

    @Override
    public Student getStudent() {
        Student student = new Student();
        student.setId(1L);
        student.setName("guomz");
        System.out.println("被调用了");
        return student;
    }
}

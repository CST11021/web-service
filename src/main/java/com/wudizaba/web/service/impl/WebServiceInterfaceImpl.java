package com.wudizaba.web.service.impl;

import com.wudizaba.web.domain.po.Student;
import com.wudizaba.web.service.WebServiceInterface;
import org.springframework.context.annotation.Configuration;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Configuration
@WebService(serviceName = "WebServiceInterface", endpointInterface = "com.wudizaba.web.service.WebServiceInterface", targetNamespace = "http://whz.localhost.com/", portName = "WebServiceInterfacePort")
public class WebServiceInterfaceImpl implements WebServiceInterface {

    @Override
    public Student getStudent(String name) {
        return new Student("123456", name, "18", "male");
    }

    @Override
    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("123456", "wudizaba", "18", "male");
        Student s2 = new Student("123457", "wudizaba", "18", "male");
        Student s3 = new Student("123458", "wudizaba", "18", "male");
        Student s4 = new Student("123459", "wudizaba", "18", "male");
        Collections.addAll(students, s1, s2, s3, s4);
        return students;
    }

}

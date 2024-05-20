package com.wudizaba.web.service;


import com.wudizaba.web.domain.po.Student;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@Component
@WebService
public interface WebServiceInterface {

    @WebMethod
    Student getStudent(String name);

    @WebMethod
    List<Student> getAllStudent();
}

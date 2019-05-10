package com.springcloud.dataservice.service;

import com.springcloud.dataservice.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentInfoService {
    public List<Student> getStudentList() {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setPort("8001");
        s1.setId("1111111");
        s1.setName("fengwuJ");
        s2.setPort("8001");
        s2.setId("2222222");
        s2.setName("且听风舞");
        list.add(s1);
        list.add(s2);
        return list;
    }
}

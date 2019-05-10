package com.springcloud.viewservice.service;


import com.springcloud.viewservice.client.RibbonClient;
import com.springcloud.viewservice.pojo.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RibbonStudentService {
    @Resource
    private RibbonClient ribbonClient;

    public List<Student> listStudents() {
        return ribbonClient.listStudents();
    }
}


package com.springcloud.dataservice.controller;

import com.springcloud.dataservice.model.Student;
import com.springcloud.dataservice.service.StudentInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class StudentInfoController {
    @Resource
    private StudentInfoService studentInfoService;

    @RequestMapping("/getStudents")
    public List<Student> getStuList(){
        return studentInfoService.getStudentList();
    }
}

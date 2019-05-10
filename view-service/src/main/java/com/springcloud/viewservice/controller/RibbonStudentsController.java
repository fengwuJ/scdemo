package com.springcloud.viewservice.controller;

import com.springcloud.viewservice.pojo.Student;
import com.springcloud.viewservice.service.RibbonStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import java.util.List;

@Controller
public class RibbonStudentsController {
    @Resource
    private RibbonStudentService ribbonStudentService;

    @RequestMapping("/getStudents")
    public String getSudents(Model model){
        List<Student> list = ribbonStudentService.listStudents();
        model.addAttribute("list",list);
        return "showStudents";
    }
}

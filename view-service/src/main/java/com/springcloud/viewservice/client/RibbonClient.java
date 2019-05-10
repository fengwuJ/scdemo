package com.springcloud.viewservice.client;

import com.springcloud.viewservice.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/*  Ribbon方式
@Component
public class RibbonClient {
    @Autowired
    RestTemplate restTemplate;
    public List<Student> listStudents() {
        return restTemplate.getForObject("http://data-service/getStudents",List.class);
    }
}
*/

//Feign方式
@FeignClient(value = "data-service")
public interface RibbonClient{
    @RequestMapping("/getStudents")
    List<Student> listStudents();
}
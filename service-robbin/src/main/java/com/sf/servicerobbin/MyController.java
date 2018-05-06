package com.sf.servicerobbin;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * User: qusifan
 * Date: 2018/5/6
 * Time: 上午11:55
 */
@RestController
public class MyController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(@RequestParam String name){
        return restTemplate.getForObject
                ("http://serviceHi/hi?name="+name,String.class);
    }


    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }


}

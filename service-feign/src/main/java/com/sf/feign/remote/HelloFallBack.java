package com.sf.feign.remote;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: qusifan
 * Date: 2018/5/6
 * Time: 下午1:57
 */
@Component
public class HelloFallBack implements HelloFeign {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}

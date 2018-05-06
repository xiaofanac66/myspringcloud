package com.sf.feign.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * User: qusifan
 * Date: 2018/5/6
 * Time: 下午1:43
 */
@FeignClient(value = "serviceHi",fallback = HelloFallBack.class)
public interface HelloFeign {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

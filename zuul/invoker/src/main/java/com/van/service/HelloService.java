package com.van.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service")
public interface HelloService {

    @RequestMapping("/service01/{parm}")
    String hello(@PathVariable("parm") String parm);
}

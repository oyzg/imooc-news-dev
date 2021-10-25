package com.imooc.user.controller;

import com.imooc.api.controller.user.HelloControllerApi;
import com.imooc.grace.result.GraceJSONResult;
import com.imooc.grace.result.IMOOCJSONResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloControllerApi {


    private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @Override
    public Object hello() {
        LOG.debug("debug: Hello");
        LOG.info("info: Hello");
        LOG.warn("warn: Hello");
        LOG.error("error: Hello");
//        return "hello";
//        return IMOOCJSONResult.ok("hello");
        return GraceJSONResult.ok("hello");
    }




}

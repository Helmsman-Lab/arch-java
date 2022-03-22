package com.arch.bootstrap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoxianghui
 * @Title: HelloWorld
 * @Description:
 * @date 2022/3/22-13:52
 */
@RestController
public class HelloWorld {

    @GetMapping("/hw/{name}")
    public String hello(@PathVariable String name) {
        return "hello: " + name;
    }
}

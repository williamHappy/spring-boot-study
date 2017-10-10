package cn.will.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc:
 * Author: will
 * Date: 17:03 2017/9/20
 */
@RestController
public class HelloSpringBootController {

    @RequestMapping("/")
    String home() {
        return "Greetings from Spring Boot!";
    }

}

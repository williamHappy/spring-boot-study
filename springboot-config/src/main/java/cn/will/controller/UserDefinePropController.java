package cn.will.controller;

import cn.will.domain.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc:
 * Author: will
 * Date: 19:08 2017/9/28
 */
@RestController
@EnableConfigurationProperties({PersonEntity.class})
public class UserDefinePropController {

    @Autowired
    PersonEntity personEntity;

    @Value("${me.name}")
    private String name;

    @Value("${me.age}")
    private int age;

    @RequestMapping("/me")
    public String me() {
        return name + ":" + age;
    }

    @RequestMapping("/you")
    public String you() {
        return personEntity.getGreeting() + ">>>>" + personEntity.getName() + ">>>>" + personEntity.getAge() + ">>>>" + personEntity.getUuid() + ">>>>" + personEntity.getMax();
    }

}

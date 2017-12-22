package cn.will;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc:
 * Author: will
 * Date: 15:40 2017/12/22
 */
@SpringBootApplication
@RestController
public class SpringbootWithDockerApplication {
    @RequestMapping("/")
    public String home(){
        return "Hello Docker World!";
    }
    public static void main(String[] args){
        SpringApplication.run(SpringbootWithDockerApplication.class, args);
    }
}

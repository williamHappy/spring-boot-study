package cn.will;

import cn.will.service.Service;
import cn.will.service.ServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc:
 * Author: will
 * Date: 19:43 2017/12/12
 */
@SpringBootApplication
@Import(ServiceConfiguration.class)
@RestController
public class Application {

    @Autowired
    public Application(Service service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return service.message();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    private final Service service;


}

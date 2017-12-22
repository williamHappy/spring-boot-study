package cn.will;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Desc:
 * Author: will
 * Date: 19:28 2017/11/10
 */
@SpringBootApplication
@EnableScheduling
public class SpringbootSchedulingTasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSchedulingTasksApplication.class, args);
    }

}

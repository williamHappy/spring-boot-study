package cn.will;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Desc:
 * Author: will
 * Date: 10:24 2017/10/12
 */
@SpringBootApplication
public class SpringbootApplicationStart {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootApplicationStart.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplicationStart.class, args);
    }

}

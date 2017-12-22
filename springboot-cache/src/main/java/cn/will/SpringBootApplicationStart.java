package cn.will;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Desc:
 * Author: will
 * Date: 16:10 2017/10/21
 */
@SpringBootApplication
@EnableCaching
public class SpringBootApplicationStart {
    public static void main(String[] argas) {
        SpringApplication.run(SpringBootApplicationStart.class, argas);
    }
}

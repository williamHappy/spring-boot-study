package cn.will;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Desc:
 * Author: will
 * Date: 15:58 2017/11/8
 */
@SpringBootApplication
public class SpringbootRestTemplateApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootRestTemplateApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRestTemplateApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner runner(RestTemplate restTemplate) {
        return args -> {
            String quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", String.class);
            LOGGER.info(quote.toString());
        };
    }

}

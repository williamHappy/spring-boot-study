package cn.will.service;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Desc:
 * Author: will
 * Date: 19:34 2017/12/12
 */
@Configuration
@EnableConfigurationProperties(ServiceProperties.class)
public class ServiceConfiguration {

    @Bean
    public Service service(ServiceProperties properties){
        return new Service(properties.getMessage());
    }

}

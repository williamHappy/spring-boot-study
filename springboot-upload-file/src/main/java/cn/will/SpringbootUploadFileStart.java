package cn.will;

import cn.will.service.FileUploadService;
import cn.will.service.StorageProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * Desc:
 * Author: will
 * Date: 11:18 2017/11/10
 */
@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class SpringbootUploadFileStart {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootUploadFileStart.class, args);
    }

    @Bean
    CommandLineRunner init(FileUploadService fileUploadService){
        return (args) -> {
            fileUploadService.deleteAll();
            fileUploadService.init();
        };
    }
}

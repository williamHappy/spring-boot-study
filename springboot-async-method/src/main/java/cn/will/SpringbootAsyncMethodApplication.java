package cn.will;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Desc:
 * Author: will
 * Date: 19:27 2017/12/18
 */
@SpringBootApplication
@EnableAsync
public class SpringbootAsyncMethodApplication extends AsyncConfigurerSupport {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootAsyncMethodApplication.class, args);
    }

    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(2);
        executor.setQueueCapacity(500);
        executor.setThreadNamePrefix("GitHubLookUp-");
        executor.initialize();
        return executor;
    }
}

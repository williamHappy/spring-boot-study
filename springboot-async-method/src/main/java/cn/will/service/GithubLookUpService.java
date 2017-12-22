package cn.will.service;

import cn.will.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Future;

/**
 * Desc:
 * Author: will
 * Date: 18:01 2017/12/18
 */
@Service
public class GithubLookUpService {
    private static final Logger LOGGER = LoggerFactory.getLogger(GithubLookUpService.class);

    private final RestTemplate restTemplate;

    public GithubLookUpService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Async
    public Future<User> findUser(String user) throws InterruptedException {
        LOGGER.info("looking up " + user);
        String url = String.format("https://api.github.com/users/%s", user);
        User results = restTemplate.getForObject(url, User.class);
        Thread.sleep(1000L);
        return new AsyncResult<>(results);
    }
}

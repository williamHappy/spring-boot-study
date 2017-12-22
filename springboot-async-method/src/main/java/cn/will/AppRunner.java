package cn.will;

import cn.will.entity.User;
import cn.will.service.GithubLookUpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * Desc:
 * Author: will
 * Date: 19:16 2017/12/18
 */
@Component
public class AppRunner implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(AppRunner.class);

    private final GithubLookUpService githubLookUpService;

    public AppRunner(GithubLookUpService githubLookUpService) {
        this.githubLookUpService = githubLookUpService;
    }

    @Override
    public void run(String... strings) throws Exception {
        //start the clock
        long start = System.currentTimeMillis();

        Future<User> page1 = githubLookUpService.findUser("PivotalSoftware");
        Future<User> page2 = githubLookUpService.findUser("cloudFoundry");
        Future<User> page3 = githubLookUpService.findUser("Spring-Projects");

        while (!(page1.isDone() && page2.isDone() && page3.isDone())) {
            Thread.sleep(10);
        }
        LOGGER.info("Elapsed time" + (System.currentTimeMillis() - start));
        LOGGER.info("--> " + page1.get());
        LOGGER.info("--> " + page2.get());
        LOGGER.info("--> " + page3.get());
    }
}

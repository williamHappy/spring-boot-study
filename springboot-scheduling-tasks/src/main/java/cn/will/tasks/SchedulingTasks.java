package cn.will.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Desc:
 * Author: will
 * Date: 19:31 2017/11/10
 */
@Component
public class SchedulingTasks {

    private static final Logger LOGGER = LoggerFactory.getLogger(SchedulingTasks.class);

    private static final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        LOGGER.info("The time is now {}", format.format(new Date()));
    }

}

package cn.will;

import cn.will.dao.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Desc:
 * Author: will
 * Date: 10:33 2017/10/12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationStartTest {

    public static Logger logger = LoggerFactory.getLogger(SpringbootApplicationStartTest.class);

    @Autowired
    private RedisDao redisDao;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testRedis() {
        redisDao.setKey("name", "will");
        redisDao.setKey("age", "11");
        logger.info(redisDao.getValue("name"));
        logger.info(redisDao.getValue("age"));
    }

}

package cn.will;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Desc:
 * Author: will
 * Date: 16:03 2017/12/22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootElkApplicationTest {

    @Test
    public void contextLoads() {
    }

    private Logger logger = Logger.getLogger(getClass());

    @Test
    public void test() throws Exception {
        for (int i = 0; i < 100; i++) {
            logger.info("输出info ");
            logger.debug("输出debug+skkw嗡嗡kw");
            logger.error("输出error 嗡嗡");
        }
    }
}

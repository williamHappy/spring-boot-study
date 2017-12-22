package cn.will;

import cn.will.dao.BookDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Desc:
 * Author: will
 * Date: 15:56 2017/10/21
 */
@Component
public class AppRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

    private final BookDao bookDao;

    public AppRunner(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void run(String... strings) throws Exception {
        logger.info(".... Fetching books");
        logger.info("isbn-1234 -->" + bookDao.getByIsbn("isbn-1234"));
        logger.info("isbn-4567 -->" + bookDao.getByIsbn("isbn-4567"));
        logger.info("isbn-1234 -->" + bookDao.getByIsbn("isbn-1234"));
        logger.info("isbn-4567 -->" + bookDao.getByIsbn("isbn-4567"));
        logger.info("isbn-1234 -->" + bookDao.getByIsbn("isbn-1234"));
        logger.info("isbn-1234 -->" + bookDao.getByIsbn("isbn-1234"));
    }
}

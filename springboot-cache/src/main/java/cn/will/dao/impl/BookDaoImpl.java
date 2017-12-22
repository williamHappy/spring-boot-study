package cn.will.dao.impl;

import cn.will.dao.BookDao;
import cn.will.entity.Book;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * Desc:
 * Author: will
 * Date: 15:45 2017/10/21
 */
@Component
public class BookDaoImpl implements BookDao {
    @Override
    @Cacheable("books")
    public Book getByIsbn(String isbn) {
        simulateSlowService();
        return new Book(isbn, "Some Book");
    }

    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}

package cn.will.dao;

import cn.will.entity.Book;

/**
 * Desc:
 * Author: will
 * Date: 15:42 2017/10/21
 */
public interface BookDao {

    Book getByIsbn(String isbn);

}

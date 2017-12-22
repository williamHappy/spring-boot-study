package cn.will.controller;

import cn.will.entity.Book;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.*;

/**
 * Desc:
 * Author: will
 * Date: 19:49 2017/10/20
 */
@RestController
@RequestMapping(value = "/books")
public class BookController {

    Map<Long, Book> books = Collections.synchronizedMap(new HashMap<Long, Book>());

    @ApiOperation(value = "获取图书列表", notes = "获取图书列表")
    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public List<Book> getBooks() {
        List<Book> book = new ArrayList<>(books.values());
        return book;
    }

    @ApiOperation(value = "创建图书", notes = "创建图书")
    @ApiImplicitParam(name = "book", value = "图书详细实体", required = true, dataType = "Book")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postBook(@RequestBody Book book) {
        books.put(book.getId(), book);
        return "success";
    }

    @ApiOperation(value = "获取图书详细信息", notes = "根据url的id来获取详细信息")
    @ApiImplicitParam(name = "id", value = "ID", required = true, dataType = "Long", paramType = "path")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book getBook(@PathVariable Long id) {
        return books.get(id);
    }

    @ApiOperation(value = "更新信息", notes = "根据url的id更新指定的图书信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "图书ID", required = true, dataType = "Long", paramType = "path"),
            @ApiImplicitParam(name = "book", value = "图书实体", required = true, dataType = "Book")
    })

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String putUser(@PathVariable Long id, @RequestBody Book book) {
        Book book1 = books.get(id);
        book1.setName(book.getName());
        book1.setPrice(book.getPrice());
        books.put(id, book1);
        return "success";
    }

    @ApiOperation(value = "删除图书信息", notes = "根据url的id来删除指定的图书信息")
    @ApiImplicitParam(name = "id", value = "图书的ID", dataType = "Long", paramType = "path")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id) {
        books.remove(id);
        return "success";
    }

    @ApiIgnore//使用注解忽略这个api
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String jsonTest() {
        return "hi, this is you";
    }

}

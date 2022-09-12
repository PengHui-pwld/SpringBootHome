package com.pengh;

import com.pengh.dao.BookDao;
import com.pengh.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WwkDemoApplicationTests {

    @Autowired
    BookService bookService;
    @Test
    void contextLoads() {
        System.out.println(bookService.service_getbyid(1));
    }

    @Autowired
    BookDao bookDao;
    @Test
    void daotest(){
        System.out.println(bookDao.getById(1));
        System.out.println(bookDao.selectById(1));
    }

}

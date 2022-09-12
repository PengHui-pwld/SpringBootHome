package com.pengh.service.Impl;

import com.pengh.dao.BookDao;
import com.pengh.domain.Book;
import com.pengh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;


    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public Book service_getbyid(Integer id) {
        Book byId = bookDao.getById(id);
        return byId;
    }
}

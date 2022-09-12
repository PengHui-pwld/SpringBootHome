package com.pengh.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pengh.dao.BookDao;
import com.pengh.domain.Book;
import com.pengh.service.IBookService;
import org.springframework.stereotype.Service;

@Service
public class IBookServiceImpl  extends ServiceImpl<BookDao, Book> implements IBookService {
    @Override
    public void get() {

    }

}

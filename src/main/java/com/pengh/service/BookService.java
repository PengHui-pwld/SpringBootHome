package com.pengh.service;

import com.pengh.domain.Book;
import org.springframework.stereotype.Service;


@Service
public interface BookService {
    boolean delete(Integer id);
    Book service_getbyid(Integer id);
}

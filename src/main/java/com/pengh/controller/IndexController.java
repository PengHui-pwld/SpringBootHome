package com.pengh.controller;

import com.pengh.controller.utils.R;
import com.pengh.dao.BookDao;
import com.pengh.domain.Book;
import com.pengh.service.BookService;
import com.pengh.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import java.util.ArrayList;

@RestController
public class IndexController {

    @Autowired
    private BookDao bookDao;


    @GetMapping("/hello")
    public String hello(){
        return "ggggg";
    }

    @GetMapping("/byid/{id}")
    public String Bydi(@PathVariable Integer id){
        Book byId = bookDao.getById(id);
        return ""+byId;
    }

    @GetMapping("/byall")
    public String Byall(){
        ArrayList<Book> byId = bookDao.getAll();
        return ""+byId;
    }

    @Autowired
    private BookService bookService;

    @GetMapping("/ok")
    public String getById(){
       return ""+bookService.service_getbyid(1);
    }


    @Autowired
    private IBookService iBookService;
    @GetMapping("/mp")
    public String MP_getById(){
        return ""+iBookService.list();
    }

    //对数据做统一的分装，方便前端人员的调用，
    // flag 表示方法执行的成功和失败，data是封装的数据，其中flag=false data=null 表示操作失败返回
    // 返回数据为空，flag=true data=null 表示方法本身就不返回数据
    @PostMapping("/r")
    public R save(@RequestBody Book book){
        return new R(iBookService.save(book));
    }

    @GetMapping("/rgetbyid/{id}")
    public R rgetbydi(@PathVariable Integer id){
        return new R(true,iBookService.getById(id));
    }

}

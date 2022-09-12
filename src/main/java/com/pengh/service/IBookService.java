package com.pengh.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pengh.domain.Book;
import org.springframework.stereotype.Service;

/*业务层快速开发，与数据层相似，继承一个MP已经写好的方法，要实现自定义的方法继续添加即可
* */

public interface IBookService extends IService<Book>{
    void get();
}

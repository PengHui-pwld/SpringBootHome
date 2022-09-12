package com.pengh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pengh.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface BookDao extends BaseMapper<Book>{
    @Select("select * from book where id= #{id}")
    public Book getById(Integer id);

    @Select("select * from book")
    public ArrayList<Book> getAll();
}

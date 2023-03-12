package com.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entity.Book;
import com.mapper.BookMapper;
import org.springframework.stereotype.Service;
import com.service.BookService;

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {
}

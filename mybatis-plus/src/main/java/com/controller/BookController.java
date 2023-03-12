package com.controller;

import com.Util.CommonResult;
import com.entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.service.BookService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/findAll")
    public List<Book> queryAll(){
        return bookService.list(null) ;

    }

    @PostMapping("/saveBook")
    public CommonResult inserBook(@RequestBody Book book){
        return new CommonResult(bookService.save(book));
    }

    @PostMapping("/updateBook")
    public CommonResult updateBook(@RequestBody Book book){
        return  new CommonResult(bookService.updateById(book));
    }

    @GetMapping("/deleteBook/{id}")
    public CommonResult  updateBook(@PathVariable Integer id){
        boolean b = bookService.removeById(id);
        return b?new CommonResult("null","删除成功",200):new CommonResult("null","删除失败",200);
    }

    @GetMapping("/getBook/{id}")
    public CommonResult getBook(@PathVariable Integer id){

        Book book = bookService.getById(id);
        if(book != null){
            return new CommonResult(book);
        }else{
            return  new CommonResult("查询失败");
        }



    }
}

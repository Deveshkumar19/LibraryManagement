package com.Devesh.Project.LibraryMangement.Controller;

import com.Devesh.Project.LibraryMangement.Model.Book;
import com.Devesh.Project.LibraryMangement.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

/**
 * Book Controller to Add , find book
 */
@RestController
@EnableSwagger2
public class BookController {

    @Autowired
    BookRepository bookRepository;


    /**
     * @return  List of @{@link Book}
     */
    @RequestMapping(value = "/getAllBooks",method = RequestMethod.GET)
    public List<Book> getAllBooks(){

        return (List<Book>) bookRepository.findAll();
    }

    /**
     * @param book
     */
    @RequestMapping(value="/addBook",method=RequestMethod.POST)
    public void addBook(@RequestParam Book book){
         bookRepository.save(book);
    }

}

package com.Devesh.Project.LibraryMangement.Controller;

import com.Devesh.Project.LibraryMangement.Model.BookIssued;
import com.Devesh.Project.LibraryMangement.Repository.BookIssuedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@EnableSwagger2
public class BookIssuedController {

    @Autowired
    BookIssuedRepository bookIssuedRepository;

    /**
     * @return
     */
    @RequestMapping(value = "/getAllIssuedBooks",method = RequestMethod.GET)
    public List<BookIssued> getAllIssuedBooks(){

        return (List<BookIssued>) bookIssuedRepository.findAll();
    }

    /**
     * @param bookIssued
     */
    @RequestMapping(value="/addIssuedBook",method=RequestMethod.POST)
    public void addIssuedBook(@RequestParam BookIssued bookIssued){
        bookIssuedRepository.save(bookIssued);
    }

}

package com.Devesh.Project.LibraryMangement.Controller;

import com.Devesh.Project.LibraryMangement.Model.IssuedBook;
import com.Devesh.Project.LibraryMangement.Model.User;
import com.Devesh.Project.LibraryMangement.Repository.IssuedBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@EnableSwagger2
public class IssuedBookController {

    @Autowired
    IssuedBookRepository issuedBookRepository;

    /**
     * @return
     */
    @RequestMapping(value = "/getAllIssuedBooks",method = RequestMethod.GET)
    public List<IssuedBook> getAllIssuedBooks(){

        return (List<IssuedBook>) issuedBookRepository.findAll();
    }

    /**
     * @param issuedBook
     */
    @RequestMapping(value="/addIssuedBook",method=RequestMethod.POST)
    public void addIssuedBook(@RequestParam IssuedBook issuedBook){
        issuedBookRepository.save(issuedBook);
    }

}

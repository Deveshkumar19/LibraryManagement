package com.Devesh.Project.LibraryMangement.Controller;

import com.Devesh.Project.LibraryMangement.Model.Book;
import com.Devesh.Project.LibraryMangement.Model.User;
import com.Devesh.Project.LibraryMangement.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.validation.Valid;
import java.util.List;

@RestController
@EnableSwagger2
public class UserController {

    @Autowired
    UserRepository userRepository;

    /**
     * @return
     */
    @RequestMapping(value = "/getAllUsers",method = RequestMethod.GET)
    public List<User> getAllUsers(){

        return (List<User>) userRepository.findAll();
    }

    /**
     * @param users
     */
    @RequestMapping(value="/addUser",method=RequestMethod.POST)
    public void addUser(@Valid  @RequestBody User users){
        userRepository.save(users);
    }
}

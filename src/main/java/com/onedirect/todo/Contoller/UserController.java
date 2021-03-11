package com.onedirect.todo.Contoller;

import com.onedirect.todo.Dto.UserDto;
import com.onedirect.todo.model.Todoitem;
import com.onedirect.todo.model.User;
import com.onedirect.todo.repo.TodoRepo;
import com.onedirect.todo.repo.UserRepo;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.rmi.server.UID;
import java.util.List;
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserRepo userRepo;
    @GetMapping
    public List<User> findAll(){
        return userRepo.findAll();

    }
    @PostMapping
    public User save(@Validated @NotNull @RequestBody User user){
        return userRepo.save(user);
    }
    @PutMapping
    public User update(@Validated @NotNull @RequestBody User user){
        return (User) userRepo.save(user);
    }
    @DeleteMapping
    public void delete(@PathVariable Long id){
        userRepo.deleteById(id);
    }
}


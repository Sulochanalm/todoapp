package com.onedirect.todo.Contoller;

import com.onedirect.todo.Dto.CatogoryDto;
import com.onedirect.todo.Dto.TodoitemDto;
import com.onedirect.todo.model.Todoitem;
import com.onedirect.todo.model.User;
import com.onedirect.todo.model.catogory;
import com.onedirect.todo.repo.CatoRepo;
import com.onedirect.todo.repo.TodoRepo;
import com.onedirect.todo.repo.UserRepo;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class Controller {
    @Autowired
    private TodoRepo todoRepo;

    @Autowired
    private CatoRepo catoRepo;
    @Autowired
    private UserRepo userRepo;


    @GetMapping
    public List<Todoitem> findAll(){
        return todoRepo.findAll();

    }
    @PostMapping
    public TodoitemDto save(@Validated @NotNull @RequestBody TodoitemDto todoitemDto){
       Todoitem t1 = new Todoitem();
       Todoitem t2=new Todoitem();

//       User user = new User();
//       user.setUsername(todoitemDto.getUserName());
//       userRepo.save(user);

        t1.setTitle(todoitemDto.getTitle());



        List<catogory> c1 = catoRepo.findByCato(todoitemDto.getCategory());
        List<User> u1= userRepo.findByUsername(todoitemDto.getUserName());

        catogory c2=  c1.get(0);
        //User u2=u1.get(0);
        User u2;
        if (!u1.isEmpty()&& u1!=null)
        {
            u2=u1.get(0);

            //u2.setUsername(user.getUsername());
        }
        else {
            u2 = new User();
            u2.setUsername(todoitemDto.getUserName());
            userRepo.save(u2);
        }





        t1.setCatogory(c2);
        t1.setUser(u2);
        todoRepo.save(t1);
        //t1.setCategory(catogory.getc);
        return null;
        //return catoRepo.save(todoitemDto);
        //return catoRepo.findByCato(todoitemDto.getCategory());
    }



    @PutMapping
    public Todoitem update(@Validated @NotNull @RequestBody Todoitem todoitem){
    return todoRepo.save(todoitem);
    }
    @DeleteMapping
    public void delete(@PathVariable Long id){
    todoRepo.deleteById(id);
    }
}

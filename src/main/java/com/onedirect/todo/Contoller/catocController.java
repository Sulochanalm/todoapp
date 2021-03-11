package com.onedirect.todo.Contoller;


import com.onedirect.todo.Dto.CatogoryDto;
import com.onedirect.todo.model.catogory;
import com.onedirect.todo.repo.CatoRepo;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/cato")
public class catocController {
    @Autowired
    private CatoRepo catoRepo;
    private String catogory;

    @GetMapping
    public List<catogory> findAll(){
        return catoRepo.findAll();

    }
    @PostMapping
    public catogory save(@Validated @NotNull @RequestBody catogory catogory){
        return catoRepo.save(catogory);
    }
    @PutMapping
    public catogory update(@Validated @NotNull @RequestBody catogory catogory){
        return catoRepo.save(catogory);
    }
    @DeleteMapping
    public void delete(@PathVariable Long id){
        catoRepo.deleteById(id);
    }


}

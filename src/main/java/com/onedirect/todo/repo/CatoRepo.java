package com.onedirect.todo.repo;

import com.onedirect.todo.model.catogory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatoRepo extends JpaRepository<catogory, Long> {

    public List<catogory> findByCato(String cato);
    //select * from category where cato=xyz
}

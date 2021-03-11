package com.onedirect.todo.repo;

import com.onedirect.todo.model.Todoitem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TodoRepo extends JpaRepository<Todoitem,Long> {





}

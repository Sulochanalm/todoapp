package com.onedirect.todo.repo;

import com.onedirect.todo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    public List<User> findByUsername(String username);


}

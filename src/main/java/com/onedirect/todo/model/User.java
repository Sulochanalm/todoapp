package com.onedirect.todo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @Id
    @GeneratedValue
    @Column(unique = true)
    private long uid;
    private String username;
  @OneToMany(mappedBy = "user")
  private Set<Todoitem> todoitems;

}

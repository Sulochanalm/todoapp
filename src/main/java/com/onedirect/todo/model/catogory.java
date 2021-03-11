package com.onedirect.todo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class catogory {
    @Id
    @GeneratedValue
    @Column(unique = true)
    private Long cid;

    private String cato;

    @OneToMany(mappedBy ="catogory")
    private Set<Todoitem>todoitems;
//    @OneToOne(mappedBy = "catogory")
//    private Todoitem todoitem;



}

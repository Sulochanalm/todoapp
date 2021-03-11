package com.onedirect.todo.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name= "todoitem")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todoitem {

    @Id
    @GeneratedValue
    private long  id;

    private String title;
    private boolean done;


     @ManyToOne
     @JoinColumn(name="cid",nullable = false)
    private catogory catogory;

    @ManyToOne
    @JoinColumn(name="uid",nullable = false)
    private User user;



//    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    @JoinColumn(name ="id",referencedColumnName ="cid" )
//    private catogory catogory;

}

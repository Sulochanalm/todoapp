package com.onedirect.todo.Dto;

import lombok.Data;

@Data
public class TodoitemDto {
    private String title;
    private String category;
    private String userName;
    private long uid;
    private long cid;


}

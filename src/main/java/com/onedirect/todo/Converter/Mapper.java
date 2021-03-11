package com.onedirect.todo.Converter;


import com.onedirect.todo.Dto.TodoitemDto;
import com.onedirect.todo.model.Todoitem;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public TodoitemDto entityToDto(Todoitem todoitem){
        TodoitemDto dto = new TodoitemDto();
//        dto.setTitle((Todoitem.getTitle));
//        dto.setCategory(Todoitem.getCategory);
//        dto.setUserName(Todoitem.getUserName);
        return dto;

    }
//    public Todoitem dtoToEntity(TodoitemDto dto){
//        Todoitem Ti=new Todoitem();
//        Ti.setTitle(dto.getTitle());
//        Ti.setCatogory(dto.getCategory());
//        Ti.setUserName(dto.getUserName())
//
//
//
//    }


}

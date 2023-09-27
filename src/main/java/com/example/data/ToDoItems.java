package com.example.data;

import com.example.model.Person;
import com.example.model.ToDo;
import com.sun.tools.javac.comp.Todo;

import java.util.Collection;

public interface ToDoItems {
    ToDo create(ToDo toDo);

    Collection<ToDo> findAll();

    ToDo findById(int id);


    Collection<ToDo> findAllByDoneStatus(boolean done);

    Collection<ToDo> findByAssignee(int assignee);

    Collection<ToDo> findByAssignee(Person person);

    Collection<ToDo> findByUnassignedToDoItems();

    ToDo update(Todo toDo);

    boolean deleteById(int id);
}

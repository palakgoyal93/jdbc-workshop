package com.example.data;

import com.example.model.Person;

import java.util.Collection;

public interface People {
    Person create(Person person);
    Person update(Person person);
    Collection<Person> findAll();
    Collection<Person> findByName(String name);
    Person findById(int id);
    boolean delete(int id);
}

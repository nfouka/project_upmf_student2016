package com.journaldev.springhibernate.dao;

import java.util.List;

import com.journaldev.springhibernate.model.Person;
 
public interface PersonDAO {
 
    public void addPerson(Person p);
    public void deletePerson(int id) ; 
    public List<Person> listPersons();
}
package com.cydeo.service;

import java.util.List;

public interface CrudService<T, Id> {

    T save(T object);

    List<T> findAll();

    T findById(Id id);

    void delete(T object);

    void deleteById(Id id);

}

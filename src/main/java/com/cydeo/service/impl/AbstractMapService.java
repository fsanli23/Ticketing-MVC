package com.cydeo.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractMapService<T, Id> {
    protected Map<Id, T> map = new HashMap<>();

    T save(Id id, T object) {
        map.put(id, object);
        return object;
    }

    List<T> findAll() {
        return new ArrayList<>(map.values());
    }

    T findById(Id id) {
        return map.get(id);
    }

    void deleteById(Id id) {
        map.remove(id);
    }



}

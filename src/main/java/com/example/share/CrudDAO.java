package com.example.share;

import java.util.List;

public interface CrudDAO<T> {
    void create(T t);

    List<T> readAll();

    void update(T t);

    void deleteById(int id);

}

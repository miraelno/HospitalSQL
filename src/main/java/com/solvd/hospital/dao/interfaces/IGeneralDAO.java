package com.solvd.hospital.dao.interfaces;

import java.util.List;

public interface IGeneralDAO<T> {
    T get(int id);

    List<T> getAll();

    void create(T model);

    void update(T model);

    void delete(T model);
}

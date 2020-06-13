package vn.codegym.productmanagement.services;

import java.util.List;

public interface Service<T> {
    List<T> getAll();

    T findById(int id);

    void save(T t);

    void update(int id, T t);

    void delete(int id);
}

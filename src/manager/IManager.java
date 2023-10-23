package manager;

import model.Employee;

import java.util.List;

public interface IManager<T> {
    void add(T t);
    boolean delete(int id);
    int findById(int id);
    boolean edit(int id,T t);
    List<T> findAll();
}

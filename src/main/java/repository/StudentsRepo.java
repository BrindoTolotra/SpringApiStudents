package repository;

import model.Students;

import java.util.List;

public interface StudentsRepo  {
    List<Students> findAll();

    Students save(String s);


    String deleteById(Long id);

    Students updateNameById(Long id, String newName);

    List<Students> findWhereNameLike(String query);
    // Select * from students where name like '%query%'
}
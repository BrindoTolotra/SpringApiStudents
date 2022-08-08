package repository;

import model.Students;
import repository.JDBC.Delete;
import repository.JDBC.Save;
import repository.JDBC.SelectAll;
import repository.JDBC.SelectByName;

import java.util.List;

public class ImplementationRepository implements StudentsRepo{

    @Override
    public List<Students> findAll() {
        List<Students> res = SelectAll.getAllStudents();
        return res;
    }
    @Override
    public Students save(String s) {
        Students result = Save.addStudent(s);
        return result;
    }

    @Override
    public String deleteById(Long id) {
        String result = Delete.deleteById(id);
        return result;
    }

    @Override
    public Students updateNameById(Long id, String newName) {
        return null;
    }

    @Override
    public List<Students> findWhereNameLike(String name) {
        List<Students> res = SelectByName.getByName(name);
        return res;
    }
    public static ImplementationRepository getInstance(){
        ImplementationRepository pattern = new ImplementationRepository();
        return pattern;
    }
}

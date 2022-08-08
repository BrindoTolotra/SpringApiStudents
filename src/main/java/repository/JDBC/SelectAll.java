package repository.JDBC;

import model.Students;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectAll {
    public static List<Students> getAllStudents(){
        Connection con = ConnectDB.connect();
        String query = "SELECT * FROM students;";
        List<Students> result = new ArrayList<Students>();
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                Long id_student = rs.getLong("id");
                String name = rs.getString("name");
                Students someone = new Students(id_student,name);
                result.add(someone);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}

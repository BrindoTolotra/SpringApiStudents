package repository;

import model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JPQLRepo extends JpaRepository<Students,Long> {
    @Query("SELECT x FROM Students x")
    List<Students> findAll();

    @Query("DELETE from Students s where s.id= :id ")
    void deleteById(@Param("id") Long id);

    @Query("SELECT y FROM Students y WHERE y.name LIKE '%:name%'")
    List<Students> findByName(@Param("name") String name);
}

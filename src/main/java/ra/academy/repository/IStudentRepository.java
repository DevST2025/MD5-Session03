package ra.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.academy.model.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, String> {
}

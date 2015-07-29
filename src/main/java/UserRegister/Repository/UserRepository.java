package UserRegister.Repository;

import UserRegister.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by KAJIWARAYutaka on 2015/04/18.
 */
public interface UserRepository  extends JpaRepository<Student,Integer>{
}

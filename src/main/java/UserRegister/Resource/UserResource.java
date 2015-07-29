package UserRegister.Resource;

import UserRegister.Repository.UserRepository;
import UserRegister.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserResource {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value="students",method = RequestMethod.GET)
    List<Student> getStudentsList(){
        return userRepository.findAll();
    }

    @RequestMapping(value="student/{id}",method = RequestMethod.GET)
    Student getStudent(@PathVariable(value = "id")int id){
        return userRepository.findOne(id);
    }

    @RequestMapping(value = "student", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    void createStudent(@RequestBody Student student) {
       userRepository.save(student);
    }

    @RequestMapping(value = "student/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteStudent(@PathVariable(value = "id")int id){
        userRepository.delete(id);
    }
}

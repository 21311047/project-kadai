package UserRegister.Controller;

import UserRegister.Repository.UserRepository;
import UserRegister.model.Student;
import UserRegister.model.StudentForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by KAJIWARAYutaka on 2015/05/02.
 */
@Controller
@RequestMapping(value="/")
public class ShowUserListController {
    @Autowired
    UserRepository userRepository;


    @RequestMapping(value="users" ,method = RequestMethod.GET)
    public String usersShow(Model model){
        List<Student> users = userRepository.findAll();
        model.addAttribute("users",users);

        return "userList";
    }
}

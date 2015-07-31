package UserRegister;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import UserRegister.Repository.UserRepository;
import UserRegister.model.Student;

@SpringBootApplication
public class UserRegisterApplication implements CommandLineRunner{
    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(UserRegisterApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        Student student = new Student();
        //Create
        student.setId(21311047);
        student.setName("うの ゆうすけ");
        userRepository.save(student);
        //Select(Read)
        student = userRepository.findOne(21311047);
        System.out.println("User ID = " + student.getId());
        System.out.println("User Name = " + student.getName());

        //Update
        student.setName("宇野 裕介");
        userRepository.save(student);
        //Select
        student = userRepository.findOne(21311047);
        System.out.println("User ID = " + student.getId());
        System.out.println("User Name = " + student.getName());

        //Delete
        System.out.println("Delete User ? y/N");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if(answer.equals("y")){
            userRepository.delete(student);
        }

    }
}

package springboot.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/user")
    public User getUser() {
        return new User("littlelamb",1);
    }

    @GetMapping("/users")
    public List<User> getStudents(){

        List<User> users = new ArrayList<>();
        users.add(new User("littlelamb_1",1));
        users.add(new User("littlelamb_2",2));
        users.add(new User("littlelamb_3",3));
        users.add(new User("littlelamb_4",4));
        users.add(new User("littlelamb_5",5));
        users.add(new User("littlelamb_6",6));

        return users;
    }


    @GetMapping("{userName}/{userId}")
    public User userPathVariable(@PathVariable("userName") String userName,@PathVariable("userId") Integer userId){
        return new User(userName,userId);
    }

    //http://localhost:8080/user?usrName=littlelamb&userId=1
    @GetMapping("/user/query")
    public User userQueryParam(
            @RequestParam(name="userName") String userName,
            @RequestParam(name="userId") Integer userId){

        return new User(userName,userId);
    }
}

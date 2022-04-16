package com.example.code1.controller;

import com.example.code1.entity.User;
import com.example.code1.repository.UserMapper;
import com.example.code1.repository.UserRepository;
import com.example.code1.service.MainService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import java.util.List;
import com.example.code1.service.MainService;

import javax.servlet.http.HttpServlet.*;



@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MainService mainService;

    //connect JPA?
    @Resource
    private UserRepository userRepository;

   @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String login(String username, String password, String balance, HttpSession session){
        User user = userMapper.selectByUandP(username, password, balance);
        if(user == null){
            return "Failed";
        }
        session.setAttribute("username", username);
        //return "success";
         return user.getBalance();
    }
   @RequestMapping(value = "/action") //点了存取已经转到这里了
     public List<User> action(HttpServletRequest request, HttpSession session) {
       int amount = Integer.valueOf(request.getParameter("amount")); //match name, get
       String username = (String) session.getAttribute("username");
       String act = request.getParameter("Money");
       if (act == "Deposit") {
           mainService.deposit(username, amount);
       }else if (act =="Withdraw"){
           mainService.withdraw(username,amount);
       }
       return userRepository.getAll();//???没有加上去
   }




    @RequestMapping(path="/")//test datasets
    public List<User> getUsers() {
        return userRepository.getAll();
    }


}

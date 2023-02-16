package com.example.labo.Controller;


import com.example.labo.Entity.User;
import com.example.labo.Service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;


@RestController
//@Api(tags = "Gestion ")
@RequestMapping("/user")
public class Controller {

    @Autowired
    ServiceUser serviceUser;

    //http://localhost:8087/SpringMVC/swagger-ui/index.html


    @PostMapping("/addUser")
    @ResponseBody
    public User ajouterClient(@RequestBody User user) {
        return serviceUser.ajouterUser(user);
    }

    @GetMapping("/getall")
    @ResponseBody
    public List<User> getClient() {
        return serviceUser.getUsers();
    }

}
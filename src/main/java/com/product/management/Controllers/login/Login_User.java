package com.product.management.Controllers.login;

import com.product.management.Models.Login.Person;
import com.product.management.Services.login._Login_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signup")
public class Login_User {
    @Autowired
    private _Login_ log;
    @RequestMapping
    public String signup(){
        return "Signin";
    }
    @RequestMapping("/save")
    public String save(@ModelAttribute Person person){
           log.register(person);
        return "Signin";
    }
}

package com.product.management.Services.login;
import com.product.management.Models.Login.Person;
import com.product.management.Repository.login.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class _Login_ {
    @Autowired
    private Login login;

    public List<Person> getall(){
        return login.findAll();
    }
    public Optional<Person> getperson(int id){
          return login.findById(id);
    }
    public  Person register(Person p){
        return login.save(p);
    }
    public Person updateperson(Person p){
         return login.save(p);
    }

    public void deletebyid(int id) {
        login.deleteById(id);
    }
    public void deleteall() {
        login.deleteAll();
    }
}

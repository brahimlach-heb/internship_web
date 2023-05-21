package com.product.management.Repository.login;

import com.product.management.Models.Login.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Login extends JpaRepository<Person,Integer> {
}

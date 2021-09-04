package com.javaapi.restapi.Repo;

import com.javaapi.restapi.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Long> {
}

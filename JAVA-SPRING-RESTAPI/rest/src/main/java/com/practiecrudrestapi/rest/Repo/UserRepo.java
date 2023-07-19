package com.practiecrudrestapi.rest.Repo;


import com.practiecrudrestapi.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}

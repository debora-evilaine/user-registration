package com.user.registrarion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.user.registrarion.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}

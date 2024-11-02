package com.tradingplatform.userservice.repository;

import com.tradingplatform.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);
}
